package my.service;

import entity.auto.Auto;
import my.config.RootConfig;
import my.service.auto.AutoService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class AutoServiceTest {

    @Autowired
    private AutoService autoService;

    @Ignore
    @Test
    public void addTest() {

        Auto auto = new Auto(1, "Tesla X", "Red", 2020, 75.0);

        autoService.addAuto(auto);

    }

    @Test
    public void deleteTest() {
        autoService.deleteAuto(1);
    }
}
