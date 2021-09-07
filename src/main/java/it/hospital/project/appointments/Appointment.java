/*
 * This code is unpublished proprietary trade secret of
 * Visiona Sp. z o.o., ul. Życzkowskiego 14, 31-864 Kraków, Poland.
 *
 * This code is protected under Act on Copyright and Related Rights
 * and may be used only under the terms of license granted by
 * Visiona Sp. z o.o., ul. Życzkowskiego 14, 31-864 Kraków, Poland.
 *
 * Above notice must be preserved in all copies of this code.
 */

package it.hospital.project.appointments;

import it.hospital.project.clinicservices.ClinicService;
import it.hospital.project.unregisteredusers.UnregisteredUser;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_APPOINTMENTS")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    UnregisteredUser unRegUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    ClinicService clinicService;

    String doctor;

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UnregisteredUser getUnRegUser() {
        return unRegUser;
    }

    public void setUnRegUser(UnregisteredUser unRegUser) {
        this.unRegUser = unRegUser;
    }

    public ClinicService getClinicService() {
        return clinicService;
    }

    public void setClinicService(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
