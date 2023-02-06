package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {

    @GetMapping({"/login.html"})
    public ModelAndView loginPage() {
        System.out.println("Call loginPage");
        return new ModelAndView("login");
    }
}
