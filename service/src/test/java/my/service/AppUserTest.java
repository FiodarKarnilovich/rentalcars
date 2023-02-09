package my.service;


import entity.app_users.AppUser;
import entity.app_users.AppUserRole;
import my.config.RootConfig;
import my.service.user.AppUserRoleService;
import my.service.user.AppUserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class AppUserTest {

    @Autowired
    private AppUserRoleService appUserRoleService;

    @Autowired
    private AppUserService appUserService;

    @Ignore
    @Test
    public void addAppUser() {

        AppUserRole host = new AppUserRole(1, "host");
        AppUserRole appUserRole = appUserRoleService.addAppUserRole(host);

        AppUser fiodar = new AppUser(1, appUserRole, "Fiodar");
        AppUser appUser = appUserService.addAppUser(fiodar);

    }

    @Test
    public void findByEmail(){

        AppUser appUser = appUserService.findByEmail("admin@admin.com");
        if (appUser==null){
            System.out.println("Not found");
        } else {
            System.out.println("Found " + appUser) ;
        }
    }

}
