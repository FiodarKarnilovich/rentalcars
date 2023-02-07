package controllers;

import my.service.auto.AutoService;
import my.service.dto.AutoForListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ShowListCarsController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/showlistcars/{pageId}.html")
    public ModelAndView showListCars(@PathVariable int pageId){

        int countAutoOnPage = 3;
        long countAuto = autoService.countAuto();
        List<AutoForListDTO> autoForListDTOS = autoService.autoList(pageId-1, countAutoOnPage);
        long pages = countAuto/countAutoOnPage;
        if (countAuto % countAutoOnPage != 0) {
            pages++;
        }
        ArrayList<Integer> page = new ArrayList<>();
        for (int i = 1; i <= pages; i++) {
            page.add(i);
        }
        return new ModelAndView(
                "show_list_cars",
                Map.of("listCars", autoForListDTOS, "pages", page)
        );
    }
}
