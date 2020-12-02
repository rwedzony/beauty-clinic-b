package it.arcade.hospital.user.patient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import it.arcade.hospital.user.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "patient")
public class Patient extends User {

    @Column(name = "pesel")
    private String pesel;
//fixme add necessary relation annotation
//    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
//    private List<Reservation> reservation = new ArrayList<>();
}
