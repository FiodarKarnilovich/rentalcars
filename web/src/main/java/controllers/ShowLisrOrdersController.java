package controllers;

import my.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ShowLisrOrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/show_list_order.html")
    public ModelAndView showOrderList(){
        return new ModelAndView("show_list_orders", Map.of("orders", orderService.listOrders()));
    }
}
