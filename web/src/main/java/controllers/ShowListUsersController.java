package controllers;

import my.service.dto.UserForListDTO;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ShowListUsersController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/showlistusers/{pageId}.html")
    public ModelAndView showListUsers(@PathVariable int pageId){

        int countUserOnPage = 3;
        long countUser = appUserService.countUsers();
        List<UserForListDTO>  userForListDTO = appUserService.userList(pageId - 1, countUserOnPage);

        long pages = countUser/countUserOnPage;
        if (countUser % countUserOnPage != 0) {
            pages++;
        }
        ArrayList<Integer> page = new ArrayList<>();
        for (int i = 1; i <= pages; i++) {
            page.add(i);
        }
        return new ModelAndView(
                "show_list_users",
                Map.of("listUsers", userForListDTO, "pages", page)
        );
    }
}
