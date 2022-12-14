package esprit.spring.tn.examala.Controller;


import esprit.spring.tn.examala.Entity.Project;
import esprit.spring.tn.examala.Entity.Sprint;
import esprit.spring.tn.examala.Entity.User;
import esprit.spring.tn.examala.Repository.ProjectRepository;
import esprit.spring.tn.examala.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("Project")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/getAll")
    public List<Project> retrieveAllProjects() {
        return projectRepository.findAll();
    }
    @PostMapping("/add")
    public Project addProject(@RequestBody Project project){
        return projectRepository.save(project);
    }

    public void addAndAssignToProject(Sprint sprint, int idProject){

    }
}
