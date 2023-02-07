package controllers;

import my.service.auto.AutoPictureService;
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
    @Autowired
    private AutoPictureService autoPictureService;

    @GetMapping("/view_car_details/{car.id}.view")
    public ModelAndView viewCarDetails(@PathVariable("car.id") Integer id){
        return new ModelAndView(
                "view_car_details",
                Map.of("car", autoService.fullAutoInf(id))
        );
    }

//    @ResponseBody
//    @GetMapping("/image/{car.id}/photo.jpg")
//    public byte[] getImage(@PathVariable("car.id") Integer carId) {
//        System.out.println("Call getImage: " + carId);
//        return autoPictureService.getById(carId).getPicture();
//    }
}
