package clonecoding.photogram.domain.subscribe;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

public interface SubscribeRepository extends JpaRepository<Subscribe, Integer> {

}
