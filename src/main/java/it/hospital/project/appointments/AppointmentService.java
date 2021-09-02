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


import it.hospital.project.unregisteredusers.UnregisteredUser;
import it.hospital.project.unregisteredusers.UnregisteredUserRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final UnregisteredUserRepository unregisteredUserRepository;

    public AppointmentService(AppointmentRepository appointmentRepository, UnregisteredUserRepository unregisteredUserRepository) {
        this.appointmentRepository = appointmentRepository;
        this.unregisteredUserRepository = unregisteredUserRepository;
    }

    Appointment addAppointmentAsUnregUser(AppointmentUnregisteredUserDto appointmentUnregisteredUserDto) {
        Appointment appointment = new Appointment();
        UnregisteredUser unregisteredUser = new UnregisteredUser();

        unregisteredUser.setEmail(appointmentUnregisteredUserDto.getEmail());
        unregisteredUser.setFirstName(appointmentUnregisteredUserDto.getFirstName());
        unregisteredUser.setLastName(appointmentUnregisteredUserDto.getLastName());
        unregisteredUser.setPhoneNumber(appointmentUnregisteredUserDto.getPhone());

        unregisteredUserRepository.save(unregisteredUser);
        appointment.setUnRegUser(unregisteredUser);
        appointment.setDate(LocalDate.parse(appointmentUnregisteredUserDto.getDate()));
        appointmentRepository.save(appointment);

        return appointment;
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
