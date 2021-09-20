package pl.rafsoftrw.beautyclinic.frontendtest;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@CrossOrigin
public class HealthController {

    @GetMapping("")
    public ResponseEntity<?> getTestData() {
        return ResponseEntity.ok(Map.of("status", "OK"));
    }
}
