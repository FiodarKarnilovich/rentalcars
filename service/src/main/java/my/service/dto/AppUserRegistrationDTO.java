package my.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppUserRegistrationDTO {

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String birthDay;

    private String phoneNumber;


}
