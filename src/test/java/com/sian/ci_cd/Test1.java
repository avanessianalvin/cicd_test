package com.sian.ci_cd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test1 {
    @Test
    public void failTestSolved(){
        System.out.println("THIS IS TEST 1");
        assertEquals(2,2);
    }


    @Test
    public void passTest(){
        assertEquals(3,3);
    }
}
