package it.arcade.hospital.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    /*
        Every methods used in @service was taken from basic crud JpaRepository method
    */
}
