package it.hospital.project.appusers;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@Table(name = "Appuser")
public class User {

    @Id
    private int id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;

    private String city;

    private String postcode;

    private String email;

    private String password;

}
