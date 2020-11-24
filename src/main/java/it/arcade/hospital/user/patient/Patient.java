package it.arcade.hospital.user.patient;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import it.arcade.hospital.medicalrecord.MedicalRecord;
import it.arcade.hospital.reservation.Reservation;
import it.arcade.hospital.user.User;

import lombok.*;


@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "patient")
public class Patient extends User {

    @Column(name = "pesel")
    private String pesel;

    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
    private List<Reservation> reservation = new ArrayList<>();
}
