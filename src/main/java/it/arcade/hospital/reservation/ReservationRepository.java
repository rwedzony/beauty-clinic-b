package it.arcade.hospital.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    void saveReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);

    Reservation findReservationById(Long reservationId);

    List<Reservation> findAllReservationByPatient(Patient patient);

    List<Reservation> findAllReservationByDoctor(Doctor doctor);
}
