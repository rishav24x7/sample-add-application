package org.rishav;

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

}