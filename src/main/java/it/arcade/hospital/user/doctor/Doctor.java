package it.arcade.hospital.user.doctor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import it.arcade.hospital.department.Department;
import it.arcade.hospital.medicalrecord.MedicalRecord;
import it.arcade.hospital.role.Role;
import it.arcade.hospital.specialisation.Specialisation;
import it.arcade.hospital.user.User;

import lombok.*;


@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "doctor")
public class Doctor extends User {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    private Department department;

    private List<Specialisation> specialisationsList = new ArrayList<>();
    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
}
