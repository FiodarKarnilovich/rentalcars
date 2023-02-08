package controllers;

import my.service.auto.AutoService;
import my.service.dto.PriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChangePriceAutoController {

    @Autowired
    private AutoService autoService;

    @PostMapping("/change_price/${car.id}.html")
    public String updatePrice(@PathVariable("car.id") Integer id, PriceDTO priceDTO){
        autoService.changePriceAuto(id, priceDTO);
        return "redirect:/showlistcars/{id}.html";
    }

    @GetMapping ("/change_price/${car.id}.html")
    public String updatePrice(@PathVariable("car.id") Integer id){
        return "change_price_auto";
    }


}
