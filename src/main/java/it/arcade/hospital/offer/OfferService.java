package it.arcade.hospital.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;

@Service
public class OfferService {
	
	private final OfferRepository offerRepository;

	@Autowired
	public OfferService(OfferRepository offerRepository) {
		this.offerRepository = offerRepository;
	}
	
	public List<Offer> getAllOffersForDepartment(Department department) {
		List<Offer> offers = offerRepository.findAllByDepartment(department);
		return offerRepository.findAllByDepartment(department);

	}
	
	public List<Offer> getAllOffersByName (String name) {
		List<Offer> offers = offerRepository.findAllByName(name);
		return isEmpty(offers) ? new ArrayList<Offer>() : offers;
	}

}
