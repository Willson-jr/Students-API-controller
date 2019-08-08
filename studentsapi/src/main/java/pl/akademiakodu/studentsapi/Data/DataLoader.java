package pl.akademiakodu.studentsapi.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.stereotype.Component;
import pl.akademiakodu.studentsapi.Model.Student;
import pl.akademiakodu.studentsapi.Repository.StudentRepository;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run (String... args) throws Exception{
        if (studentRepository.count()==0){
            studentRepository.save(new Student("Adam","Kowalski"));
            studentRepository.save(new Student("Piotr","Nowak"));
            studentRepository.save(new Student("Anna","Makaruk"));
            studentRepository.save(new Student("Agniezka","Gontarz"));
        }
    }

}
