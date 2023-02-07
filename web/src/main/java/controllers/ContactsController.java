package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactsController {

    @GetMapping({"/contacts.html"})
    public ModelAndView contactsPage() {
        System.out.println("Call contactsPage");
        return new ModelAndView("contacts");
    }
}
