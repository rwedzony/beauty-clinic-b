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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    ResponseEntity<?> addAppointment(@RequestBody AppointmentUnregisteredUserDto appointmentUnregisteredUserDto) {
        return new ResponseEntity<>(appointmentService.addAppointmentAsUnregUser(appointmentUnregisteredUserDto), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<?> getAllAppointments() {
        return new ResponseEntity<>(appointmentService.getAllAppointments(), HttpStatus.OK);
    }
}


