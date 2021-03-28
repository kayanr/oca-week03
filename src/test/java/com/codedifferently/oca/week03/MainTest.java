package com.codedifferently.oca.week03;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void unitTestMeTest(){
        Main main = new Main();
        String expected = "Boom tested";
        String actual = main.unitTestMe();
        Assert.assertEquals(expected,actual);
    }
}
