package it.arcade.hospital.reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    void saveReservation (Reservation reservation){
        reservationRepository.save(reservation);
    }

    void deleteReservation (Reservation reservation){
        reservationRepository.delete(reservation);
    }

    public Reservation findReservationById(Long reservationId){
        return reservationRepository.findReservationById(reservationId);
    }

    public List<Reservation> findAllReservationByPatient(Patient patient){
        return reservationRepository.findAllReservationByPatient(patient);
    }

    public List<Reservation> findAllReservationByDoctor(Doctor doctor){
        return reservationRepository.findAllReservationByDoctor(doctor);
    }
}
