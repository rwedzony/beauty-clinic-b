package it.arcade.hospital.user.patient;

import it.arcade.hospital.medicalrecord.MedicalRecord;
import it.arcade.hospital.user.User;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="patient")
public class Patient extends User {

    @Column(name="pesel")
    private String pesel;

    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
    private List<Reservation> reservation = new ArrayList<>();
}
