package entity.app_users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_role")
public class AppUserRole implements Serializable {


    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roleId;


    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "appUserRole")
    private List<AppUser> appUserList;

    public AppUserRole(Integer roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }
}
