package clonecoding.photogram.domain.subscribe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

public interface SubscribeRepository extends JpaRepository<Subscribe, Integer> {

    @Modifying //INSERT, DELETE, UPDATE를 네이티브 쿼리로 작성할려면 해당 애노테이션 필요
    @Query(value="INSERT INTO subscribe(fromUserId, toUserId, createDate) VALUES(:fromUserId, :toUserId, now())", nativeQuery = true)
    void mSubscribe(int fromUserId, int toUserId); //성공시 +1, 실패시 -1 (변경의 횟수만큼 +1됨)

    @Modifying
    @Query(value="DELETE FROM subscribe WHERE fromUserId= :fromUserId AND toUserId = :toUserId", nativeQuery = true)
    void mUnSubscribe(int fromUserId, int toUserId);
}
