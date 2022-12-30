package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String actual, String expected){

        if(actual.equalsIgnoreCase(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("FALSE");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }

    }
}
