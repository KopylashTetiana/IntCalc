package Calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest { //test of the main class Context to justify the need to create each method and class

    @Test
    public void run() throws Exception { //this method contains all our tests
        Context context = new Context();
        int actual = context.run("C2="); //"write an arithmetic problem for the calculator"
        int expect = 2;                 //assign the expected result
        assertEquals(expect, actual); //compare the expected result with the one that this program will produce
        assertEquals(0, context.run("C"));
        assertEquals(7, context.run("C7"));
        assertEquals(2, context.run("28C2"));
        assertEquals(89, context.run("C89="));
        assertEquals(485, context.run("C539-54="));
        assertEquals(18, context.run("C3+3*3="));
        assertEquals(12, context.run("C6+="));
        assertEquals(56, context.run("C565/10="));
        assertEquals(2025, context.run("C45*45="));
        assertEquals(5625, context.run("C75*="));
        assertEquals(-49, context.run("C-396+-*/8="));
        assertEquals(0, context.run("C0+-**3="));
        assertEquals(1, context.run("C5/="));
        assertEquals(0, context.run("C5/=="));
        assertEquals(1, context.run("C1/======="));
        assertEquals(1, context.run("C6+8-13/=="));
        assertEquals(10, context.run("C45-9/4+1="));
        assertEquals(1, context.run("C9/5="));
        assertEquals(0, context.run("C5994*000="));
        assertEquals(50, context.run("C49+-*/+1="));
        assertEquals(485, context.run("C539-54="));
        assertEquals(485, context.run("C539-54="));

    }
}