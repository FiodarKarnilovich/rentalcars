package my.service.user;

import entity.app_users.AppUser;
import entity.app_users.AppUserRole;
import my.repository.AppUserRepository;
import my.service.dto.AppUserRegistrationDTO;
import my.service.dto.UserForListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private AppUserRoleService appUserRoleService;

    public long countUsers(){
        return appUserRepository.count();
    }

    public List<AppUser> listUserForPage(int pageNumber, int pageSize){
        return appUserRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
    }

    public AppUser addAppUser(AppUser appUser) {

        return appUserRepository.save(appUser);
    }

    public void deleteAppUser(Integer id) {

        appUserRepository.deleteById(id);
    }

    public AppUser findById(Integer id){
        return appUserRepository.findById(id).get();
    }

    public AppUser findByEmail(String email){
        return appUserRepository.findAppUserByEmail(email);
    }

    public List<AppUser> listUsers() {

        return appUserRepository.findAll();
    }

    public void addNewUser(AppUserRegistrationDTO appUserRegistrationDTO) {

        AppUser appUser = new AppUser();

        AppUserRole role = appUserRoleService.getByName("APP_USER");
        if(role == null) {
            role = appUserRoleService.addAppUserRole(new AppUserRole(null, "APP_USER"));
        }

        appUser.setEmail(appUserRegistrationDTO.getEmail());
        appUser.setPassword("{noop}"+appUserRegistrationDTO.getPassword());
        appUser.setFirstName(appUserRegistrationDTO.getFirstName());
        appUser.setLastName(appUserRegistrationDTO.getLastName());
        appUser.setBirthDay(appUserRegistrationDTO.getBirthDay());
        appUser.setPhoneNumber(appUserRegistrationDTO.getPhoneNumber());
        appUser.setAppUserRole(role);
        addAppUser(appUser);
    }

    public List<UserForListDTO> userList(int pageNumber, int pageSize){

        List<AppUser> userList = listUserForPage(pageNumber, pageSize);

        List<UserForListDTO> finalListUser = new ArrayList<>();

        for (AppUser appUser : userList) {
            UserForListDTO userForListDTO = new UserForListDTO();
            userForListDTO.setId(appUser.getUserId());
            userForListDTO.setName(appUser.getFirstName());
            userForListDTO.setLastName(appUser.getLastName());
            userForListDTO.setPhone(appUser.getPhoneNumber());
            userForListDTO.setRole(appUser.getAppUserRole().getRoleName());

            finalListUser.add(userForListDTO);
        }

        return finalListUser;

    }
}
