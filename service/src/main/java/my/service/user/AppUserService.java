package my.service.user;

import entity.app_users.AppUser;
import entity.app_users.AppUserRole;
import my.repository.AppUserRepository;
import my.service.dto.AppUserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private AppUserRoleService appUserRoleService;


    public AppUser addAppUser(AppUser appUser) {

        return appUserRepository.save(appUser);
    }

    public void deleteAppUser(Integer id) {

        appUserRepository.deleteById(id);
    }

    public AppUser findByEmail(String email){
        return appUserRepository.findAppUserByEmail(email);
    }

    public void addNewUser(AppUserRegistrationDTO appUserRegistrationDTO) {

        AppUser appUser = new AppUser();

        AppUserRole role = appUserRoleService.getByName("APP_USER");
        if(role == null) {
            role = appUserRoleService.addAppUserRole(new AppUserRole(null, "APP_USER"));
        }

        appUser.setEmail(appUserRegistrationDTO.getEmail());
        appUser.setPassword(appUserRegistrationDTO.getPassword());
        appUser.setFirstName(appUserRegistrationDTO.getFirstName());
        appUser.setLastName(appUserRegistrationDTO.getLastName());
        appUser.setBirthDay(appUserRegistrationDTO.getBirthDay());
        appUser.setPhoneNumber(appUserRegistrationDTO.getPhoneNumber());
        appUser.setAppUserRole(role);
        addAppUser(appUser);
    }
}
