package com.example.demo.contoller;

import com.example.demo.domain.Repair;
import com.example.demo.models.OwnerModel;
import com.example.demo.models.RepairModel;
import com.example.demo.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class AdminHomeController {

    private static final String REPAIR_ATTR = "repairs";
    private static final String ADMIN_HOME_URL =  "adminHome";

    @Autowired
    private RepairService repairService;

    @GetMapping("/")
    public String adminhome(Model model) {
        List<RepairModel> repairs = repairService.findTop10ByFinishDayOfRepairAfter(LocalDateTime.now());
        model.addAttribute(REPAIR_ATTR, repairs);
        return "adminHome";
    }
    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }
}
