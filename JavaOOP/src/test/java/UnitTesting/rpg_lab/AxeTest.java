package UnitTesting.rpg_lab;


import org.junit.Assert;
import org.junit.Test;

public class AxeTest {
    @Test
    public void testWeaponLosesDurabilityAfterAttack() {
        //Arrange
        Axe axe = new Axe(10, 10);

        Dummy dummy = new Dummy(100, 100);

        //Act
        axe.attack(dummy);

        //Assert
        //expectations versus reality

        Assert.assertEquals(9, axe.getDurabilityPoints());
    }
}
