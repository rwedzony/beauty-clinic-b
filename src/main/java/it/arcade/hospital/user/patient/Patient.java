package it.arcade.hospital.user.patient;

import it.arcade.hospital.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends User {

    private String pesel;
//    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
//    private List<Reservation> reservationList = new ArrayList<>();
    private List<Integer> testInt = new ArrayList<>();


    public Patient() {
    }

    public Patient(Long id, String name, String surname, String email, String password, Date entryDate, String pesel) {
        super(id, name, surname, email, password, entryDate);
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

//    public void addMedicalRecord(MedicalRecord medicalRecord){
//        medicalRecordList.add(medicalRecord);
//    }
//
//    public void removeMedicalRecord(Integer indexToRemove){
//        userStatusListeners.remove(indexToRemove);
//    }
//
//    public void addReservation(Reservation reservation){
//        reservationList.add(Reservation);
//    }
//
//    public void removeReservation(Integer indexToRemove){
//        reservationList.remove(indexToRemove);
//    }
}
