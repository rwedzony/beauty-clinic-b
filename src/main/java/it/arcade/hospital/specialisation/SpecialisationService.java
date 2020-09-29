package it.arcade.hospital.specialisation;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SpecialisationService {

    @Autowired
    private SpecialisationRepository specialisationRepository;

    void addSpecialisation (Specialisation specialisation){
        specialisationRepository.save(specialisation);
    }

    void updateSpecialisation (Specialisation specialisation){
        specialisationRepository.save(specialisation);
    }

    void deleteSpecialisation (Specialisation specialisation){
        specialisationRepository.delete(specialisation);
    }

    public Optional<Specialisation> getSpecialisationById(Integer id){
        return specialisationRepository.findById(id);
    }

    public List<Specialisation> getAllSpecialisations(){
        List<Specialisation> specialisation = (List<Specialisation>) specialisationRepository.findAll();
        return specialisation;
    }
}
