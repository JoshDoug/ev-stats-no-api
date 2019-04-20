package com.joshuastringfellow.statsscraper;

import com.joshuastringfellow.statsscraper.model.FullRegistration;
import com.joshuastringfellow.statsscraper.model.Registration;
import com.joshuastringfellow.statsscraper.repos.FullRegistrationRepository;
import com.joshuastringfellow.statsscraper.repos.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    @Autowired
    FullRegistrationRepository fullRegistrationRepository;

    @Autowired
    RegistrationRepository registrationRepository;

    public FullRegistration saveFullRegistration(FullRegistration fullRegistration) {
        return fullRegistrationRepository.save(fullRegistration);
    }

    public boolean saveRegistration(Registration registration) {
        registrationRepository.save(registration);
        return true;
    }
}
