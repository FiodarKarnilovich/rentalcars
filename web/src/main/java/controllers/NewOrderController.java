package controllers;

import entity.app_users.AppUser;
import my.service.auto.AutoService;
import my.service.dto.OrderDTO;
import my.service.order.OrderService;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.Map;

@Controller
public class NewOrderController {

    @Autowired
    private AutoService autoService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private AppUserService appUserService;

    @GetMapping({"/new_order/{car.id}.html"})
    public ModelAndView newOrderPage(@PathVariable("car.id") Integer id) {
        System.out.println("Call newOrderPage");
        return new ModelAndView("new_order", Map.of("car", autoService.fullAutoInf(id)));
    }

    @PostMapping("/new_order/{car.id}.html")
    public String addNewOrder(@PathVariable("car.id") Integer id,
                                 @RequestParam("dateStart") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate sdate,
                                 @RequestParam("dateFinish") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fdate,
                                 OrderDTO orderDTO) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        orderService.addNewOrder(orderDTO, email, id, sdate, fdate);
        return "redirect:/view_car_details/"+id+".html";
    }
}
