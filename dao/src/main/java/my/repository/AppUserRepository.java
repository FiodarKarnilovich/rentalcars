package my.repository;

import entity.app_users.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    AppUser findAppUserByEmail(String email);
}
