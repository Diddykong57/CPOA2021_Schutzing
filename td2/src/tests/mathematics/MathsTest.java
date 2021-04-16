package tests.mathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {

    private IMaths maths;

    @Before
    public void setUp() {
        this.maths = new Maths();
    }

    @Test
    public void testAdditionNbPositif() {
        Assert.assertEquals(maths.addition(2, 3), 5);
    }

    @Test
    public void testAdditionNbNegatif() {
        Assert.assertEquals(maths.addition(-4, -10), -14);
    }

    @Test
    public void testAdditionNbPositifEtNegatif() {
        Assert.assertEquals(maths.addition(-4, 10), 6);
    }

    @Test
    public void testSoustractionNbPositif() {
        Assert.assertEquals(maths.soustraction(6, 3), 3);
    }
    
    @Test
    public void testSoustractionNbNegatif() {
        Assert.assertEquals(maths.soustraction(-6, -7), 1);
    }
}
