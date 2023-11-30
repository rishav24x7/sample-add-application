package org.rishav;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void addNumber_test(){
        Main main_object = new Main();
        int result = main_object.addNumbers(2,3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void subtractNumber_test(){
        Main main_object = new Main();
        int result = main_object.subtractNumbers(5,4);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void compareNumbers_test(){
        Main main_object = new Main();
        boolean result = main_object.compareNumbers(31,30);
        Assert.assertEquals(result, true);
    }

    @Test
    public void compareNumbers_test_else_block(){
        Main main_object = new Main();
        boolean result = main_object.compareNumbers(29,30);
        Assert.assertEquals(result, false);
    }

}