package esprit.spring.tn.examala.Controller;

import esprit.spring.tn.examala.Entity.Project;
import esprit.spring.tn.examala.Entity.User;
import esprit.spring.tn.examala.Repository.ProjectRepository;
import esprit.spring.tn.examala.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/getAll")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(value = "id") int id){
        userRepository.deleteById(id);
    }
    @PutMapping("/update")
    public User updateUser(@RequestBody User u){
        return userRepository.save(u);
    }
    @GetMapping("getOne/{id}")
    public User retrieveUser(@PathVariable(value = "id") int id){
        return userRepository.getById(id);
    }
    @GetMapping("/assignProjectToUser/{UserId}/{projectId}")
    public void assignProjectToUser(@PathVariable int UserId,@PathVariable int projectId){
        User u= userRepository.findById(UserId).orElse(null);
        Project p = projectRepository.findById(projectId).orElse(null);
        if(u!=null && p!=null){
            u.getProjects().add(p);
            userRepository.save(u);
        }
    }
    @GetMapping("/assignProjectToClient/{projectId}/{firstName}/{lastName}")
    public void assignProjectToClient(@PathVariable int projectId, @PathVariable String firstName, @PathVariable String lastName ){
        Project p = projectRepository.findById(projectId).orElse(null);
        User u= userRepository.findByFNameAndLName(firstName,lastName);
        if(u!=null && p!=null){
            u.getProjects().add(p);
            userRepository.save(u);
        }
    }
}

