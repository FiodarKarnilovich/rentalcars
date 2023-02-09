package controllers;

import my.service.dto.AppUserRegistrationDTO;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserRegistrationController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping({"/user_registration.html"})
    public ModelAndView userRegistrationPage() {
        System.out.println("Call userRegistrationPage");
        return new ModelAndView("user_registration");
    }

    @PostMapping({"/user_registration.html"})
    public String userRegistration(AppUserRegistrationDTO appUserRegistrationDTO) {
        appUserService.addNewUser(appUserRegistrationDTO);
        return "redirect:/index.html";
    }

}
