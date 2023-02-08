package my.service;

import my.config.RootConfig;
import my.service.auto.AutoService;
import my.service.dto.AddAutoDTO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class AddAutoTest {

    @Autowired
    private AutoService autoService;

    @Ignore
    @Test
    public void addAutoFromDTO(){
//        AddAutoDTO dto = new AddAutoDTO("BMW", "X6", "yellow", "A", 2020, 300.0, new byte[10]);
//        autoService.addNewCar(dto);
    }
}
