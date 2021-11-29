package main.java.UnitTesting.p01_Database.p03_IteratorTest;

import main.java.UnitTesting.main.java.p03_IteratorTest.ListIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {
    private ListIterator lI;

    private static final String[] ELEMENTS = {"1", "2", "3"};

    @Before
    public void setUp() throws OperationNotSupportedException {
        lI = new ListIterator("1", "2", "3");

    }


    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsException() throws OperationNotSupportedException {
        new ListIterator(null);
    }

    @Test
    public void testConstructorShouldCreateListIterator() throws OperationNotSupportedException {
        ListIterator lI = new ListIterator("1", "2", "3");
    }

    @Test
    public void testHasNext() {
        Assert.assertTrue(lI.hasNext());
        lI.move();
        Assert.assertTrue(lI.hasNext());
        lI.move();
        Assert.assertFalse(lI.hasNext());
    }

    @Test
    public void testMove() {
        Assert.assertTrue(lI.move());
        Assert.assertTrue(lI.move());
        Assert.assertFalse(lI.move());

    }

    @Test(expected = IllegalStateException.class)
    public void testPrintThrowsExceptionForEmptyList() throws OperationNotSupportedException {
        lI = new ListIterator();
        lI.print();
    }

    @Test
    public void testPrintMethod() {
        int index = 0;
        while (lI.hasNext()) {
            Assert.assertEquals(ELEMENTS[index], lI.print());
            index++;
            lI.move();
        }

    }


}
