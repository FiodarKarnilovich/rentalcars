package controllers;

import entity.app_users.AppUserRole;
import lombok.SneakyThrows;
import my.service.dto.RoleDTO;
import my.service.user.AppUserRoleService;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ChangeRoleController {

    @Autowired
    private AppUserRoleService appUserRoleService;
    @Autowired
    private AppUserService appUserService;

    @PostMapping("/change_role_user/{user.userId}.html")
    public String updateRolePost(@PathVariable("user.userId") Integer id, RoleDTO roleDTO){
        appUserService.changeRole(id, roleDTO);
        return "redirect:/view_user_details/"+id+".html";
    }

    @GetMapping("/change_role_user/{user.userId}.html")
    public ModelAndView updateRoleGet(@PathVariable("user.userId") Integer id){
        return new ModelAndView("change_role_user",
                Map.of("user", appUserService.findById(id), "roles", appUserRoleService.allRoles()));
    }
}
