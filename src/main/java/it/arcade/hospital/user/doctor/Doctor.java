package it.arcade.hospital.user.doctor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import it.arcade.hospital.department.Department;
import it.arcade.hospital.role.Role;
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
@Table(name = "doctor")
public class Doctor extends User {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    private Department department;
//fixme add necessary relation annotation
//    private List<Specialisation> specialisationsList = new ArrayList<>();
//    private List<MedicalRecord> medicalRecordList = new ArrayList<>();
}
