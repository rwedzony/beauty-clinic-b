package it.arcade.hospital.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findReservationByPatient(Patient patient);

    List<Reservation> findReservationByDoctor(Doctor doctor);

    List<Reservation> saveReservation(Reservation reservation);

    List<Reservation> deleteReservation(Reservation reservation);
}
