package pl.akademiakodu.studentsapi.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.studentsapi.Model.Student;
import pl.akademiakodu.studentsapi.Repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentApiController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("")
    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("")
    public Student create(@ModelAttribute Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public Student show(@PathVariable Integer id){
        return studentRepository.findById(id).get();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        studentRepository.deleteById(id);
    }


}
