package controllers;

import entity.auto.Auto;
import lombok.SneakyThrows;
import my.service.auto.AutoService;
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
    public String addEmployee(@RequestParam("photo") MultipartFile file, Auto auto) {
        System.out.println("Call new auto: " + auto);
        System.out.println(file.getOriginalFilename() + ": " + file.getSize());
        autoService.addAuto(auto); // еще надо добавить как то фото
        return "redirect:/showlistcars/{pageId}.html";
    }
}
