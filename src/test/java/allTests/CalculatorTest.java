package allTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import po.Calculator;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

/**
 * Created by mtumilowicz on 2018-08-10.
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

    @Parameters(name = "{index}: sum({0} + {1})={2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 }, 
                { 1, 1, 2 }, 
                { 2, 1, 3 }, 
                { 1, 3, 4 }, 
                { -4, 4, 0 }, 
                { -5, -5, -10 }, 
                { -3, 6, 3 }
        });
    }

    private int a;
    private int b;
    private int expectedSum;

    public CalculatorTest(int a, int b, int expectedSum) {
        this.a = a;
        this.b = b;
        this.expectedSum = expectedSum;
    }
//asdhaidshksd daskdshdas
    @Test
    public void add() {
        assertEquals(expectedSum, Calculator.add(a, b));
        for(int i=0;i<10;i++){
            int k=i*1;
            System.out.println(k+1);
        }
        System.out.println("Test Run completed-add");
    }
}