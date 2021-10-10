package cm.bridgelabz.MyGreetingApp.model;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class User {
    private String firstName;
    private String lastName;

}