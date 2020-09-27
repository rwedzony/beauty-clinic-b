package it.arcade.hospital.offer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "offers", path = "offers")
public interface OfferRepository extends JpaRepository<Offer, Long> {

	List<Offer> findAllByDepartment(Department department);
	List<Offer> findAllByName(String name);

}
