package pl.akademiakodu.studentsapi.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.studentsapi.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}
