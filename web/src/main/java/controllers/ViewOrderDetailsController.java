package controllers;

import my.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ViewOrderDetailsController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/view_order_details/{order.orderId}.html")
    public ModelAndView showOrderDetails(@PathVariable("order.orderId") Integer id){
        return new ModelAndView("view_order_details", Map.of("order", orderService.getOrder(id)));
    }

}
