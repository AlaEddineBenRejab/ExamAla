package esprit.spring.tn.examala.Repository;

import esprit.spring.tn.examala.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByFNameAndLName(String f,String l);
}
