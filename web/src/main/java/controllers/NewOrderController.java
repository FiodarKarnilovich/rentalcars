package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewOrderController {

    @GetMapping({"/new_order.html"})
    public ModelAndView newOrderPage() {
        System.out.println("Call newOrderPage");
        return new ModelAndView("new_order");
    }
}
