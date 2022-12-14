package esprit.spring.tn.examala.Controller;


import esprit.spring.tn.examala.Entity.Sprint;
import esprit.spring.tn.examala.Repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Sprint")
public class SprintController {
    @Autowired
    SprintRepository sprintRepository;
    @GetMapping("/getAll")
    public List<Sprint> retrieveAllUsers() {
        return sprintRepository.findAll();
    }
    @PostMapping("/add")
    public Sprint addUser(@RequestBody Sprint s){
        return sprintRepository.save(s);
    }
}
