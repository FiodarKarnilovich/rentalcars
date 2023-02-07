package controllers;

import my.service.auto.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ViewCarDetailsController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/view_car_details/{car.id}.view")
    public ModelAndView viewCarDetails(@PathVariable("car.id") Integer id){
        return new ModelAndView(
                "view_car_details",
                Map.of("car", autoService.fullAutoInf(id))
        );
    }
}
