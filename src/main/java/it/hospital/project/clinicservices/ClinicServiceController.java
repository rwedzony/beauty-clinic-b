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

package it.hospital.project.clinicservices;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/services")
public class ClinicServiceController {
    private final ClinicServiceService clinicServiceService;

    public ClinicServiceController(ClinicServiceService clinicServiceService) {
        this.clinicServiceService = clinicServiceService;
    }

    @GetMapping
    ResponseEntity<?> getAllClinicServices() {
        List<ClinicService> clinicServices = clinicServiceService.getAllClinicServices();
        return new ResponseEntity<>(clinicServices, HttpStatus.OK);
    }
}
