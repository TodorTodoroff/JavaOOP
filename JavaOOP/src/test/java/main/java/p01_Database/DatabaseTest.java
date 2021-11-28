package main.java.p01_Database;

import UnitTesting.main.java.p01_Database.Database;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private static final Integer[] NUMBERS = {1, 2, 3, 4};

    private Database database;

    @Before
    public void SetUp() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testIfTheConstructorCreatesValidDatabase() throws OperationNotSupportedException {

        Assert.assertEquals("Count of db elements is not correct",database.getElements().length,NUMBERS.length);

        for (int i = 0; i < NUMBERS.length; i++) {
            Assert.assertEquals("We have different element values in the db",database.getElements()[i],NUMBERS[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfConstructorThrowsExceptionForExceedingMaximumAmountOfElements() throws OperationNotSupportedException {
        new Database(new Integer[17]);

    }

}
