package main.java.UnitTesting.p01_Database.rpg_lab;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DummyTest {
    private static final int HEALTH = 100;
    private static final int XP = 50;

    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, XP);
        this.deadDummy = new Dummy(0, XP);
    }

    @Test
    public void testIfDummyTakesAttack() {
        int attackPoints = 10;
        dummy.takeAttack(attackPoints);

        assertEquals(HEALTH - attackPoints, dummy.getHealth());

    }

    @Test(expected = IllegalStateException.class)
    public void testIfDeadDummyThrowsExceptionWhenAttacked() {
        deadDummy.takeAttack(1000);
    }

    @Test
    public void testIfDeadDummyGivesExp(){
        int actual = deadDummy.giveExperience();
        assertEquals(XP,actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testIfAliveDummyThrowsWhenGiveXp(){
        dummy.giveExperience();
    }
}
