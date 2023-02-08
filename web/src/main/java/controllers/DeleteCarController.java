package controllers;

import my.service.auto.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeleteCarController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/delete_car/{car.id}.html")
    public String deleteCar(@PathVariable("car.id") Integer id){
        autoService.deleteAuto(id);
        return "redirect:/showlistcars/1.html";
    }
}
