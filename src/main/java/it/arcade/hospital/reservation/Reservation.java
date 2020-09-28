package it.arcade.hospital.reservation;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient")
    Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_doctor")
    Doctor doctor;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    Date starDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date")
    Date endDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entry_date")
    Date entryDate;
}
