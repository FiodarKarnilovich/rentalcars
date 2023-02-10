package controllers;

import entity.app_users.AppUserRole;
import lombok.SneakyThrows;
import my.service.user.AppUserRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ChangeRoleController {

    private AppUserRoleService appUserRoleService;

    @PostMapping("/change_role_user/{user.use3rId}.html")
    @SneakyThrows
    public String updateRolePost(@PathVariable("user.userId") Integer id, AppUserRole appUserRole){
        appUserRoleService.deleteRole(id);
        appUserRoleService.addAppUserRole(appUserRole);
        return "redirect:/view_user_details/"+id+".html";
    }

    @GetMapping("/change_role_user/{user.userId}.html")
    public ModelAndView updateRoleGet(@PathVariable("user.userId") Integer id , AppUserRole appUserRole){
        return new ModelAndView("change_role_user",
                Map.of("user", appUserRoleService.addAppUserRole(appUserRole)));
    } // тут вообще стремно
}
