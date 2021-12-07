package pl.rafsoftrw.beautyclinic.endpoints;

import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Health", description = "usługa sprawdzająca działanie aplikacji")
@RestController
@RequestMapping("/api/health")
@CrossOrigin
public class HealthEndpoint {

    @ApiOperation(value = "HealthEndpoint to check if app is running")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK")
    })
    @GetMapping("")
    public ResponseEntity<?> getTestData() {
        return ResponseEntity.ok(Map.of("status", "OK"));
    }
}
