package controllers;

import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ViewUserDetailsController {

    @Autowired
    private AppUserService appUserService;

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/view_user_details/{user.id}.html")
    public ModelAndView showUserPage(@PathVariable("user.id") Integer id){
        return new ModelAndView("view_user_details",
                Map.of("user", appUserService.findById(id))
        );
    }
}
