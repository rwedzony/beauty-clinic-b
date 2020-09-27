package it.arcade.hospital.user.doctor;

import it.arcade.hospital.medicalrecord.MedicalRecord;
import it.arcade.hospital.user.User;
import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="doctor")
public class Doctor extends User {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    private Department department;

    private List<Specialisations> specialisationsList = new ArrayList<>();
    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
}
