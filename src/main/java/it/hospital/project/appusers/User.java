package it.hospital.project.appusers;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pesel;
    private String firstName;
    private String lastName;
    private String description;
    private String url;
    private String phoneNumber;
    private String address;
    private String city;
    private String postcode;
    private String email;
    private String password;

    public User() {
    }

    public User(String pesel, String firstName, String lastName, String description, String url, String phoneNumber,
                String address, String city, String postcode, String email, String password) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.url = url;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.email = email;
        this.password = password;
    }

    public User(Long id, String pesel, String firstName, String lastName, String description, String url,
                String phoneNumber, String city, String address, String postcode, String email, String password) {
        this.id = id;
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.url = url;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.email = email;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
