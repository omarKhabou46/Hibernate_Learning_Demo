package ma.enset;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Enseignant {
    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Id
    private int id;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String name;
    private String lastName;
}
