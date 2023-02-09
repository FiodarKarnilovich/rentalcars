package controllers;

import entity.auto.Auto;
import lombok.SneakyThrows;
import my.service.auto.AutoService;
import my.service.dto.AddAutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class NewCarRegistrationController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/new_car_registration.html")
    public ModelAndView newCarRegistrationPage() {

        System.out.println("Call newCarRegistrationPage");
        return new ModelAndView("new_car_registration");
    }

    @PostMapping("/new_car_registration.html")
    @SneakyThrows
    public String addCar(@RequestParam("autoPicture") MultipartFile file, AddAutoDTO addAutoDTO) {

        autoService.addNewCar(addAutoDTO, file.getBytes());
        return "redirect:/show_list_cars/1.html";
    }
}
