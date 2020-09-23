package it.arcade.hospital.user.doctor;

import it.arcade.hospital.user.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor extends User {

    private Role role;
    private Departmen departmen;
    private List<Specialisations> specialisationsList = new ArrayList<>();
    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
    private List<Integer> test = new ArrayList<>();;

    public Doctor(Role role, Departmen departmen) {
        this.role = role;
        this.departmen = departmen;
    }

    public Doctor(Long id, String name, String surname, String email, String password, Date entryDate, Role role, Departmen departmen) {
        super(id, name, surname, email, password, entryDate);
        this.role = role;
        this.departmen = departmen;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Departmen getDepartmen() {
        return departmen;
    }

    public void setDepartmen(Departmen departmen) {
        this.departmen = departmen;
    }

    public void addSpecialisations(Specialisations specialization){
        specialisationsList.add(specialization);
    }

    public void removeSpecialisations(Integer indexToRemove){
        specialisationsList.remove(indexToRemove);
    }

    public void addReservation(Reservation reservation){
        reservationList.add(reservation);
    }

    public void removeReservation(Integer indexToRemove){
        reservationList.remove(indexToRemove);
    }
}
