package com.example.demo.contoller;

import com.example.demo.forms.SearchOwnerForm;
import com.example.demo.models.OwnerModel;
import com.example.demo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static javax.servlet.RequestDispatcher.ERROR_MESSAGE;

@Controller
public class SearchOwnerController {
    private static final String OWNERS_ATTR = "owners";

    @Autowired
    private OwnerService ownerService;


    /*@GetMapping(value = "/example")
    public String search(Model model) {
        model.addAttribute("searchOwnerForm", new SearchOwnerForm());
        return "exampleSearch";
    }*/

    @GetMapping(value = "/owners/search")
    public String searchForOwners(Model model,
                                  @ModelAttribute(name = "searchOwnerForm") SearchOwnerForm searchOwnerForm) {
        List<OwnerModel> owners = findOwners(searchOwnerForm);
        model.addAttribute(OWNERS_ATTR, owners);
        return "ownerSearch";
    }


    private List<OwnerModel> findOwners(SearchOwnerForm searchOwnerForm) {
        String taxRegistrationNumber = searchOwnerForm.getTaxRegistrationNumber();
        String email = searchOwnerForm.getEmail();

        if (taxRegistrationNumber.isEmpty() && email.isEmpty()) {
            return ownerService.findAll();
        }

        return ownerService.findByTaxRegistrationNumberOrEmail(taxRegistrationNumber, email);
    }


    //   @ExceptionHandler({BooksNotFoundException.class})
    public String handleError(HttpServletRequest request,
                              RedirectAttributes redirectAttrs,
                              RuntimeException e) {
        redirectAttrs.addFlashAttribute(ERROR_MESSAGE,
                "Couldn't fetch data");
        return "redirect:/";
    }

}
