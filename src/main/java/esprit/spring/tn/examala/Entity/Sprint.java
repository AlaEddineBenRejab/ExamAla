package esprit.spring.tn.examala.Entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;
    @Temporal(TemporalType.DATE)
    Date StartDate;

    @ManyToOne
    Project project;


}
