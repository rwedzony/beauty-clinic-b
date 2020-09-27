package it.arcade.hospital.medicalrecord;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class MedicalRecordService {

    private final MedicalRecordRepository medicalRecordRepository;

    public List<MedicalRecord> findMedicalRecordByPatient(Patient patient){
        return medicalRecordRepository.findByPatient(patient);
    }

    public List<MedicalRecord> findMedicalRecordByDoctor(Doctor doctor){
        return medicalRecordRepository.findByDoctor(doctor);
    }

    public MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord) throws Exception{
        try{
            return medicalRecordRepository.save(medicalRecord);
        }catch (Exception e){
            throw new Exception("Error occurred during saving MedicalRecord");
        }
    }
}
