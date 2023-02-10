package controllers;

import my.service.auto.AutoService;
import my.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeleteOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/delete_order/{order.orderId}.html")
    public String deleteCar(@PathVariable("order.orderIdd") Integer id){
        orderService.deleteOrder(id);
        return "redirect:/showlistcars/1.html";
    }
}
