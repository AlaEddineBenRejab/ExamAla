package esprit.spring.tn.examala.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    String description;

    @OneToMany(mappedBy = "project")
    List<Sprint> sprints;

    @ManyToMany
    List<User> users;



}
