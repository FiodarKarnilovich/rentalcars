package my.service;

import my.config.RootConfig;
import my.service.auto.AutoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class AutoViewAutoTest {

    @Autowired
    public AutoService autoService;

    @Test
    public void viewAutoListTest(){

        System.out.println(autoService.autoList());
    }

    @Test
    public void fullAutoList(){

        System.out.println(autoService.fullAutoInf(1));
    }
}
