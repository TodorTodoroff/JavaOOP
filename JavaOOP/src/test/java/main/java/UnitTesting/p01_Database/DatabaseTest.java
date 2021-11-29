package main.java.UnitTesting.p01_Database;

import main.java.UnitTesting.main.java.p01_Database.Database;
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

        Assert.assertEquals("Count of db elements is not correct", database.getElements().length, NUMBERS.length);

        for (int i = 0; i < NUMBERS.length; i++) {
            Assert.assertEquals("We have different element values in the db", database.getElements()[i], NUMBERS[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfConstructorThrowsExceptionForExceedingMaximumAmountOfElements() throws OperationNotSupportedException {
        new Database(new Integer[17]);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfConstructorThrowsExceptionForLessThanMinimumElements() throws OperationNotSupportedException {
        new Database(new Integer[0]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfAddMethodWithNullInputThrowsException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testIfAddMethodWorksAsExpected() throws OperationNotSupportedException {
        database.add(5);
        Assert.assertEquals(NUMBERS.length + 1, database.getElements().length);
        Assert.assertEquals(Integer.valueOf(5), database.getElements()[NUMBERS.length]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testIfRemoveMethodThrowsExceptionWhenArrayIndexOfOutOfBounds() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();
    }

    @Test
    public void testIfRemoveMethodWorksAsExpected() throws OperationNotSupportedException {
        database.remove();
        Assert.assertEquals(NUMBERS.length - 1, database.getElements().length);
        Assert.assertEquals(Integer.valueOf(NUMBERS[NUMBERS.length - 2]), database.getElements()[database.getElements().length - 1]);

    }

}
