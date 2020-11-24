package it.arcade.hospital.medicalrecord;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.arcade.hospital.user.doctor.Doctor;
import it.arcade.hospital.user.patient.Patient;


@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {

    List<MedicalRecord> findByPatient(Patient patient);

    List<MedicalRecord> findByDoctor(Doctor doctor);
}
