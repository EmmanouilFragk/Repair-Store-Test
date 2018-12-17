package com.example.demo.contoller;

import com.example.demo.domain.Repair;
import com.example.demo.models.RepairModel;
import com.example.demo.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class AdminHomeController {

    private static final String REPAIR_ATTR = "repairs";
    @Autowired
    private RepairService repairService;

    @GetMapping("/")
    public String adminhome(Model model) {
        List<RepairModel> repairs = repairService.findTop10ByFinishDayOfRepairAfter(LocalDateTime.now());
        model.addAttribute(REPAIR_ATTR, repairs);
        return "adminHome";
    }

    @GetMapping("/{id}")
    public String ownerRepairs(@PathVariable(value="id") Long id, Model model) {
        List<Repair> repairs = repairService.findRepairByOwnerId(id);
        model.addAttribute(REPAIR_ATTR, repairs);
        return "ownersrepair";
    }
}
