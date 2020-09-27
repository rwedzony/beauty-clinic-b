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
		List<Offer> offers =  offerRepository.findAllByDepartment(department);
		return isEmpty(offers) ? new ArrayList<Offer>() : offers;
	}
	
	public List<Offer> getAllOffersByName (String name) {
		List<Offer> offers =   offerRepository.findAllByName(name);
		return isEmpty(offers) ? new ArrayList<Offer>() : offers;
	}
	
	public Offer saveOrUpdateOffer(Offer offer) {
		if(offer.getId() != null) {
			Optional<Offer> foundOffer = offerRepository.findById(offer.getId());
			if(foundOffer.isPresent()) {
				Offer updatedOffer = new Offer(foundOffer.get().getId(), offer.getName(), offer.getPrice(), offer.getDepartment());
				offerRepository.save(updatedOffer);
				return updatedOffer;
			} else {
				offer = offerRepository.save(offer);
				return offer;
			}
		} else {
			offer = offerRepository.save(offer);
			return offer;
		}
	}
	
}

