package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void when4to1then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println("result: " + out);
    }

    @Test
    public void when16to4then4() {
        int expected = 4;
        int p = 16;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println("result: " + out);
    }

    @Test
    public void when20to5then5() {
        int expected = 5;
        int p = 20;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println("result: " + out);
    }

    @Test
    public void when24to4then16() {
        int expected = 16;
        int p = 24;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println("result: " + out);
    }
}