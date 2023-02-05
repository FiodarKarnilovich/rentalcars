package my.service;

import entity.auto.Auto;
import entity.auto.AutoBrand;
import entity.auto.AutoModel;
import my.config.RootConfig;
import my.service.auto.AutoBrandService;
import my.service.auto.AutoModelService;
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
    @Autowired
    private AutoBrandService autoBrandService;
    @Autowired
    private AutoModelService autoModelService;


    @Test
    public void addTest() {

        AutoBrand bmw = new AutoBrand(1, "BMW");
        AutoBrand autoBrand = autoBrandService.addAutoBrand(bmw);

        AutoModel x5 = new AutoModel(1, "X5", autoBrand);
        AutoModel autoModel = autoModelService.addAutoModel(x5);

        Auto auto = new Auto(1, "red", "m", 2020, 120.02, autoModel);

        autoService.addAuto(auto);

    }


    @Test
    public void deleteTest() {
        autoService.deleteAuto(1);
        autoModelService.deleteAutoModel(1);
        autoBrandService.deleteAutoBrand(1);
    }
}
