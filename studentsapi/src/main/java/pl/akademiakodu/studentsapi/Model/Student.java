package pl.akademiakodu.studentsapi.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
//    @JsonIgnore - ignorowana wlasciwosc s JSON nie jest wyswietlana
    private String surname;

    public Student (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

}
