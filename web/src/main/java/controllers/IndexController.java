package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/", "/index.html"})
    public String homePage() {
        System.out.println("Call home page");
        return "index";
    }

}
