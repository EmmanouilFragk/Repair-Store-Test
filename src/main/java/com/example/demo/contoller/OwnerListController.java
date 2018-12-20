package com.example.demo.contoller;

import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import com.example.demo.mappers.OwnerFormToOwnerMapper;
import com.example.demo.mappers.OwnerModelToOwnerFormMapper;
import com.example.demo.mappers.OwnerToOwnerFormMapper;
import com.example.demo.mappers.OwnerToOwnerModelMapper;
import com.example.demo.models.OwnerModel;
import com.example.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class OwnerListController {

    private static final String OWNER_ATTR = "owners";

        @Autowired
        private OwnerService ownerService;

        @GetMapping(value = "/owners")
        public String owners(Model model) {
            List<OwnerModel> owners = ownerService.findAll();
            model.addAttribute(OWNER_ATTR, owners);
            return "owners";
        }


}