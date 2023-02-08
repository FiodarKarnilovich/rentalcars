package my.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserForListDTO {

    private Integer id;

    private String name;

    private String lastName;

    private String phone;

    private String role;

    @Override
    public String toString() {
        return super.toString();
    }
}
