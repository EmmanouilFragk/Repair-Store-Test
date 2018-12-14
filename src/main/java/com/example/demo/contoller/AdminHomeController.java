package com.example.demo.contoller;

import com.example.demo.models.RepairModel;
import com.example.demo.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;

import java.util.List;

@Controller
public class AdminHomeController {

    private static final String REPAIR_ATTR = "repairs";
    @Autowired
    private RepairService repairService;

    @GetMapping("/")
    public String adminhome(Model model) {
        List<RepairModel> repairs = repairService.findAll();
        model.addAttribute(REPAIR_ATTR, repairs);
        return "adminHome";
    }
}
