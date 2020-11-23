package it.arcade.hospital.reservation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class ReservationService {

    @Autowired
    private final ReservationRepository reservationRepository;

    void addReservation(Reservation reservation){
        reservationRepository.save(reservation);
    }

    void updateReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    void deleteReservation(Reservation reservation){
        reservationRepository.delete(reservation);
    }

    public Optional<Reservation> getReservationById(Integer id){
        return reservationRepository.findById(id);
    }

    public List<Reservation> getAllReservations(){
        List<Reservation> reservations = (List<Reservation>) reservationRepository.findAll();
        return reservations;
    }
}
