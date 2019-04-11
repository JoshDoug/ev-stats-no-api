package com.joshuastringfellow.statsscraper;

import com.joshuastringfellow.statsscraper.model.FullRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class StatsController {

    private static final Logger log = LoggerFactory.getLogger(StatsController.class);

    @GetMapping("hello")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("registration/license_number/{license_number}")
    @ResponseBody
    public FullRegistration getRegistrationDetailsLicence(@PathVariable("license_number") String licenseNumber) {
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

    @GetMapping("registration/vin_number/{vin}")
    public ResponseBody getRegistrationDetailsVin(@PathVariable String vin) {

        return null;
    }

}
