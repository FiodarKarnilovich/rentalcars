package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

//    @GetMapping({"/", "/index.html"})
//    public String homePage() {
//        System.out.println("Call home page");
//        return "index";
//    }

    @GetMapping({"/", "/index.html"})
    public ModelAndView homePage() {
        System.out.println("Call homePage");
        return new ModelAndView("index");
    }

}
