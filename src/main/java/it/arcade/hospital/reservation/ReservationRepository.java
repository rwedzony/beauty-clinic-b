package it.arcade.hospital.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    /*
        Every methods used in @service was taken from basic crud JpaRepository method
     */
}
