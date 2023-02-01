package my.repository;

import entity.app_users.AppUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRoleRepository extends JpaRepository<AppUserRole, Integer> {

    AppUserRole findAppUserRoleByRoleName(String roleName);
}
