package it.arcade.hospital.offer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.arcade.hospital.department.Department;


@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

    List<Offer> findAllByDepartment(Department department);
    
    List<Offer> findAllByOfferName(String offerName);

}
