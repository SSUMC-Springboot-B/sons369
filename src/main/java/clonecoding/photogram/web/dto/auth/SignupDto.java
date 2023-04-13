package clonecoding.photogram.web.dto.auth;

//Dto는 통신에 필요한 데이터를 담는거

import clonecoding.photogram.domain.user.User;
import lombok.Data;

@Data
public class SignupDto {
    private String username;
    private String password;
    private String email;
    private String name;

    public User toEntity(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
