package it.hospital.project.unregisteredusers;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnregisteredUserRepository extends JpaRepository<UnregisteredUser, Long> {

}
