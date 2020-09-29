package it.arcade.hospital.specialisation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialisationRepository extends JpaRepository<Specialisation, Integer> {

    /*
        Every methods used in @service was taken from basic crud JpaRepository method
     */
}
