package it.arcade.hospital.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    /*
        Every methods used in @service was taken from basic crud JpaRepository method
     */
}
