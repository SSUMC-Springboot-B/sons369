package clonecoding.photogram.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //번호 증가 전략이 데이터베이스를 따라간다.
    private int id;
    private String username;
    private String password;

    private String name;
    private String website;
    private String bio;
    private String email;
    private String phone;
    private String gender;

    private LocalDateTime createDate;

    @PrePersist
    public void createDate(){
        this.createDate= LocalDateTime.now();
    }

}
