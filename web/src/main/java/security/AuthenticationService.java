package security;

import entity.app_users.AppUser;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service("authService")
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private AppUserService appUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            System.out.println("Start loadUserByUsername");
            AppUser appUser = appUserService.findByEmail(username);
            System.out.println("Find user " + appUser);
            return new UserPrincipal(appUser);
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found: " + username, e);
        }

    }

    private class UserPrincipal implements UserDetails {

        private AppUser appUser;

        public UserPrincipal(AppUser appUser) {
            this.appUser = appUser;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return List.of(() -> "ROLE_" + appUser.getAppUserRole().getRoleName());
        }

        @Override
        public String getPassword() {
            return appUser.getPassword();
        }

        @Override
        public String getUsername() {
            return appUser.getEmail();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}

