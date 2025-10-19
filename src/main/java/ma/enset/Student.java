package ma.enset;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Cacheable
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
//    @OneToMany(mappedBy = "student")
//    private List<Adresse> adresse= new ArrayList<>();
    @OneToOne
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
//    public List<Adresse> getAdresse() {
//        return adresse;
//    }
//
//    public void setAdresse(List<Adresse> adresse) {
//        this.adresse = adresse;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adresse=" + adresse +
                '}';
    }
}
