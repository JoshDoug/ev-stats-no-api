package com.joshuastringfellow.statsscraper.services;

import com.joshuastringfellow.statsscraper.StatisticsService;
import com.joshuastringfellow.statsscraper.model.Calculable;
import com.joshuastringfellow.statsscraper.model.Displacement;
import com.joshuastringfellow.statsscraper.model.FullRegistration;
import com.joshuastringfellow.statsscraper.model.UseType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class StatisticsServiceTest {

    @Autowired
    StatisticsService statisticsService;

    // Simple Integration Test
    @Test
    public void testAddFullRegistration() {

        FullRegistration fullRegistration = createFullRegistration();
        FullRegistration returnedRegistration = statisticsService.saveFullRegistration(fullRegistration);

        assertNotNull(returnedRegistration);
        assertNotNull(returnedRegistration.getRegnr());
        assertEquals(fullRegistration.getRegnr(), returnedRegistration.getRegnr());
    }

    private FullRegistration createFullRegistration() {
        // TODO - finish setting up fullReg object

        FullRegistration fullRegistration = new FullRegistration();
        fullRegistration.setRegnr("EV100000");
        fullRegistration.setTidspunkt(new Date());
        fullRegistration.setNesteOppdatering(new Date());
        fullRegistration.setKjoretoy(true);
        fullRegistration.setMerke("Test Make");
        fullRegistration.setModell("Test Model");
        fullRegistration.setType("Test Type");

        UseType useType = new UseType();
        // TODO scaffold useType
        fullRegistration.setBrukstype(useType);

        Calculable calculable = new Calculable();
        calculable.setKlasseB(true);
        fullRegistration.setKanBeregnes(calculable);

        Displacement displacement = new Displacement();
        displacement.setLiter("0");
        displacement.setSlagvolumOppgitt(0);
        fullRegistration.setSlagvolum(displacement);


        return fullRegistration;
    }
}
