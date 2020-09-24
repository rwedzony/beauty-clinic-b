package it.arcade.hospital.user.patient;

import it.arcade.hospital.user.User;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String pesel;
    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
    private List<Reservation> reservationList = new ArrayList<>();

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

    public List<MedicalRecord> getMedicalRecordList() {
        return medicalRecordList;
    }

    public void setMedicalRecordList(List<MedicalRecord> medicalRecordList) {
        this.medicalRecordList = medicalRecordList;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord){
        medicalRecordList.add(medicalRecord);
    }

    public void removeMedicalRecord(MedicalRecord medicalRecord){
        medicalRecordList.remove(medicalRecord);
    }

    public void addReservation(Reservation reservation){
        reservationList.add(reservation);
    }

    public void removeReservation(Reservation reservation){
        reservationList.remove(reservation);
    }


}
