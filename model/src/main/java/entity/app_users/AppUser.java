package entity.app_users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appuser")
public class AppUser implements Serializable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppUserRole appUserRole;


    private String email;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_day")
    private String birthDay;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +

                '}';
    }

    public AppUser(Integer userId, AppUserRole appUserRole, String firstName) {
        this.userId = userId;
        this.appUserRole = appUserRole;
        this.firstName = firstName;
    }
}
