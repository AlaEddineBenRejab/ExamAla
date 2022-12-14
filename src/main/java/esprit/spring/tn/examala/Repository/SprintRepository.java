package esprit.spring.tn.examala.Repository;

import esprit.spring.tn.examala.Entity.Project;
import esprit.spring.tn.examala.Entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
