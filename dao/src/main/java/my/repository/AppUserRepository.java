package my.repository;

import entity.app_users.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUsers, Integer> {
}
