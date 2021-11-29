package main.java.UnitTesting.p01_Database.p06_TirePressureMonitoringSystem;

import main.java.UnitTesting.main.java.p06_TirePressureMonitoringSystem.Alarm;
import main.java.UnitTesting.main.java.p06_TirePressureMonitoringSystem.Sensor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class AlarmTest{
    private static final double LOW_PRESSURE_VALUE = 12.0;
    private static final double HIGH_PRESSURE_VALUE = 50.0;
    private static final double NORMAL_PRESSURE_VALUE = 18.0;


    @Test
    public void testIfAlarmIsOnForLowPressure(){

        Sensor fakeSensor = Mockito.mock(Sensor.class);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(LOW_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());

    }
    @Test
    public void testIfAlarmIsOffForNormalPressure(){

        Sensor fakeSensor = Mockito.mock(Sensor.class);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(NORMAL_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());

    }

    @Test
    public void testIfAlarmIsOnForHighPressure(){

        Sensor fakeSensor = Mockito.mock(Sensor.class);
        when(fakeSensor.popNextPressurePsiValue()).thenReturn(HIGH_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());

    }


}
