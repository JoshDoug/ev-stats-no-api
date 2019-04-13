package com.joshuastringfellow.statsscraper;

import com.joshuastringfellow.statsscraper.model.FullRegistration;
import com.joshuastringfellow.statsscraper.model.Registration;
import com.joshuastringfellow.statsscraper.repos.FullRegistrationRepository;
import com.joshuastringfellow.statsscraper.repos.RegistrationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class StatsController {

    private static final Logger log = LoggerFactory.getLogger(StatsController.class);

    @Autowired
    FullRegistrationRepository fullRegistrationRepository;

    @Autowired
    RegistrationRepository registrationRepository;

    @GetMapping("hello")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("registration/license_number/{license_number}")
    public @ResponseBody FullRegistration getRegistrationDetailsLicence(@PathVariable("license_number") String licenseNumber) {
        final String uri = "https://www.vegvesen.no/system/mobilapi?registreringsnummer=EV50610";

        // RestTemplate uses a default Accept: application/json header, so the API returns JSON instead of the default XML
        RestTemplate restTemplate = new RestTemplate();
//        String template = restTemplate.getForObject(uri, String.class);

        FullRegistration fullRegistration = restTemplate.getForObject(uri, FullRegistration.class);
        log.info(fullRegistration.toString());

        Registration registration = new Registration(fullRegistration);
        log.info(registration.toString());

        return fullRegistration;
    }

    @PostMapping("registration/license_number/{license_number}")
    public @ResponseBody FullRegistration checkAndInsertRegistration(@PathVariable("license_number") String licenseNumber) {
        final String uri = "https://www.vegvesen.no/system/mobilapi?registreringsnummer=" + licenseNumber;

        // RestTemplate uses a default Accept: application/json header, so the API returns JSON instead of the default XML
        RestTemplate restTemplate = new RestTemplate();
        FullRegistration fullRegistration = restTemplate.getForObject(uri, FullRegistration.class);

        if(fullRegistration != null) {
            log.info(fullRegistration.toString());

            Registration registration = new Registration(fullRegistration);
            log.info(registration.toString());

            // Now to pop them into the DB, should be no big deal right?
            fullRegistrationRepository.save(fullRegistration);
            registrationRepository.save(registration);

            return fullRegistration;
        } else {
            return null;
        }
    }

    @GetMapping("registration/vin_number/{vin}")
    public ResponseBody getRegistrationDetailsVin(@PathVariable String vin) {

        return null;
    }

}
