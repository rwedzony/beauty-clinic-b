package it.arcade.hospital.reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public List<Reservation> findReservationByPatient(Patient patient){
        return reservationRepository.findReservationByPatient(patient);
    }

    public List<Reservation> findMReservationByDoctor(Doctor doctor){
        return reservationRepository.findReservationByDoctor(doctor);
    }

    public List<Reservation> saveReservation (Reservation reservation){
        return reservationRepository.saveReservation(reservation);
    }

    public List<Reservation> deleteReservation (Reservation reservation){
        return reservationRepository.deleteReservation(reservation);
    }
}
