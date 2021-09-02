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
import org.springframework.stereotype.Service;

@Service
public class ClinicServiceService {

    private final ClinicServiceRepository clinicServiceRepository;

    public ClinicServiceService(ClinicServiceRepository clinicServiceRepository) {
        this.clinicServiceRepository = clinicServiceRepository;
    }

    public List<ClinicService> getAllClinicServices() {
        return clinicServiceRepository.findAll();
    }
}
