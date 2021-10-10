package cm.bridgelabz.MyGreetingApp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private String firstName;
    private String lastName;
    private int id;

}