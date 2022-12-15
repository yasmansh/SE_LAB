package com.unittest.codecoverage.service;

import com.unittest.codecoverage.models.StreetDirectionFlow;
import org.assertj.core.api.Assertions;
import org.assertj.core.error.ShouldBeTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.models.Footpassenger;
import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLigth;
import com.unittest.codecoverage.services.TrafficBehaviorService;
import com.unittest.codecoverage.services.impl.TrafficBehaviorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class TrafficBehaviorServiceTest {

    private TrafficBehaviorService trafficBehaviorService = new TrafficBehaviorServiceImpl();

    @Test
    public void testFootpassengerCrossTheStreet_shouldThrowBehaviorExceptionWhenFootpassengerCrossesTheRoadDuringHeavyTrafficAndWhileTheTrafficLightIsRed() {

        Traffic currentTrafic = new Traffic();
        currentTrafic.setIntenseCarTraffic(true);
        currentTrafic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);

        Footpassenger currentFootpassengerBehavior = new Footpassenger();
        currentFootpassengerBehavior.setCrossedTheRoad(true);
        currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.RED);

        assertEquals(currentTrafic.getStreetDirectionFlow(), StreetDirectionFlow.ONE_WAY);
        Assertions.assertThatThrownBy(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior))
                .isInstanceOf(BehaviorException.class)
                .hasMessageContaining("You should'nt do that, reckless person");

    }

    @Test
    @DisplayName("Should throw exception when footpassenger crosses the road during heavy traffic without attention")
    public void testFootpassengerCrossTheStreet_shouldThrowBehaviorExceptionWhenFootpassengerCrossesTheRoadDuringHeavyTrafficWithoutLookSides() {

        Traffic currentTrafic = new Traffic();
        currentTrafic.setIntenseCarTraffic(true);

        Footpassenger currentFootpassengerBehavior = new Footpassenger();
        currentFootpassengerBehavior.setCrossedTheRoad(true);
        currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.GREEN);
        currentFootpassengerBehavior.setLookedToTheLeft(false);
        currentFootpassengerBehavior.setLookedToTheRight(false);

        Assertions.assertThatThrownBy(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior))
                .isInstanceOf(BehaviorException.class)
                .hasMessage("You should be more careful");

    }


    @Test
    @DisplayName("Everything is ok when The footpassenger successfully and carefully crosses the road")
    public void testFootpassengerCrossTheStreet_shouldEverythingIsOkWhenFootpassengerCrossesTheRoadSuccessfully() {

        Traffic currentTrafic = new Traffic();
        currentTrafic.setIntenseCarTraffic(true);
        Footpassenger currentFootpassengerBehavior = new Footpassenger();
        currentFootpassengerBehavior.setCrossedTheCrosswalk(true);
        currentFootpassengerBehavior.setLookedToTheRight(true);
        currentFootpassengerBehavior.setLookedToTheLeft(true);
        currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.GREEN);

        currentTrafic.setMaxSpeedAllowed((short)45);
        currentTrafic.setMinSpeedAllowed((short)30);


        assertTrue(currentFootpassengerBehavior.crossedTheCrosswalk());
        assertAll(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior));
    }
}
