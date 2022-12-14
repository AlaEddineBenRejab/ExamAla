package esprit.spring.tn.examala.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String email;
    String pwd;
    String fName;
    String lName;
    @Enumerated(EnumType.STRING)
    Role role;

    @ManyToMany
    List<Project> projects;
    @OneToMany
    private Set<Project> projectSet;

}
