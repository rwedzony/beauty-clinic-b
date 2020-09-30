package it.arcade.hospital.department;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    int id;

    @Column(name="name")
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="head_doctor")
    Doctor headDoctor;
}
