package it.arcade.hospital.user.doctor;

import it.arcade.hospital.medicalrecord.MedicalRecord;
import it.arcade.hospital.user.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor extends User {

    private Role role;
    private Department department;
    private List<Specialisations> specialisationsList = new ArrayList<>();
    private List<MedicalRecord> medicalRecordList = new ArrayList<>();

    public Doctor(Role role, Departmen department) {
        this.role = role;
        this.department = department;
    }

    public Doctor(Long id, String name, String surname, String email, String password, Date entryDate, Role role, Departmen department) {
        super(id, name, surname, email, password, entryDate);
        this.role = role;
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Specialisations> getSpecialisationsList() {
        return specialisationsList;
    }

    public void setSpecialisationsList(List<Specialisations> specialisationsList) {
        this.specialisationsList = specialisationsList;
    }

    public List<MedicalRecord> getMedicalRecordList() {
        return medicalRecordList;
    }

    public void setMedicalRecordList(List<MedicalRecord> medicalRecordList) {
        this.medicalRecordList = medicalRecordList;
    }

    public void addSpecialisations(Specialisations specialization){
        specialisationsList.add(specialization);
    }

    public void removeSpecialisations(Specialisations specialization){
        specialisationsList.remove(specialization);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord){
        medicalRecordList.add(medicalRecord);
    }

    public void removeMedicalRecord(MedicalRecord medicalRecord){
        medicalRecordList.remove(medicalRecord);
    }
}
