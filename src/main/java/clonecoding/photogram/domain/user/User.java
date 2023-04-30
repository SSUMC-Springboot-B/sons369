package clonecoding.photogram.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //디비에 테이블 생성
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //번호 증가 전략이 데이터베이스를 따라간다.
    private int id;
    @Column(unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    private String website;
    private String bio;
    @Column(nullable = false)
    private String email;
    private String phone;
    private String gender;

    private String profileImageUrl;

    private String role;

    private LocalDateTime createDate;

    @PrePersist //디비에 INSERT 되기 직전에 실행
    public void createDate(){
        this.createDate= LocalDateTime.now();
    }

}
