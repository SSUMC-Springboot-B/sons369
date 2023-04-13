package clonecoding.photogram.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

//어노테이션 없어도 JpaRepository 상속받으면 자동으로 등록해줌
public interface UserRepository extends JpaRepository<User, Integer> {
}
