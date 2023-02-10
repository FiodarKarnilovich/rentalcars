package controllers;

import my.service.auto.AutoService;
import my.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeleteOrderController {

    @Autowired
    private OrderService orderService;

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/delete_order/{order.orderId}.html")
    public String deleteCar(@PathVariable("order.orderId") Integer id){
        orderService.deleteOrder(id);
        return "redirect:/show_list_order.html";
    }
}
