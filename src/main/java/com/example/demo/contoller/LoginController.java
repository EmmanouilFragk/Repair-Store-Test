package com.example.demo.contoller;

import com.example.demo.domain.Owner;
import com.example.demo.service.OwnerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private OwnerServiceImpl ownerService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyLogin(@RequestParam String userName,
                              @RequestParam String password,
                              HttpSession session, Model model) {

        Owner owner = ownerService.loginOwner(userName, password);
        if (owner == null) {
            model.addAttribute("loginError", "Error logging in. Please try again.");
            return "login";
        }
        session.setAttribute("loggedinUser", owner);
        return "redirect:/";
    }
}
