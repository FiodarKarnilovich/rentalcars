package my.service.user;

import entity.app_users.AppUserRole;
import entity.auto.AutoBrand;
import my.repository.AppUserRoleRepository;
import my.repository.AutoBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AppUserRoleService {

    @Autowired
    private AppUserRoleRepository appUserRoleRepository;

    public AppUserRole addAppUserRole(AppUserRole appUserRole) {

        return appUserRoleRepository.save(appUserRole);
    }

    public void deleteAutoBrand(Integer id) {

        appUserRoleRepository.deleteById(id);
    }

    public AppUserRole getByName(String name) {
        return appUserRoleRepository.findAppUserRoleByRoleName(name);
    }
}
