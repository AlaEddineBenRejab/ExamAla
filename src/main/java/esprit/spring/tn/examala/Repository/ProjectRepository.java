package esprit.spring.tn.examala.Repository;

import esprit.spring.tn.examala.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}