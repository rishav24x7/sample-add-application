package org.rishav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void add_number_test(){
        Main main_object = new Main();
        int result = main_object.add_numbers(2,3);
        Assertions.assertEquals(result,5);
    }

}