package clonecoding.photogram.domain.likes;

import clonecoding.photogram.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //디비에 테이블 생성
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "likes_uk",
                columnNames = {
                        "imageId",
                        "userId"
                }) //column 명을 적어줘야함
})
public class Likes { //N

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //번호 증가 전략이 데이터베이스를 따라간다.
    private int id;

    @JoinColumn(name = "imageId")
    @ManyToOne
    private Image image; // 1

    @JoinColumn(name = "userId")
    @ManyToOne
    private User user; //1

    private LocalDateTime createDate;

    @PrePersist
    public void createDate(){
        this.createDate = LocalDateTime.now();
    }
}
