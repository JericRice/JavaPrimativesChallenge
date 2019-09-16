/*
Challenge 1

Create byte
Create short
Create int
Create long and initialize to 50000 plus 10 times the sum of the byte plus the short plus the int

*/


package com.josephrice;

public class Main {

    public static void main(String[] args) {

        byte newByte = 10;
        short newShort = 10;
        int newInt = 10;

        long newLong = 50000L + 10L * ((newByte + newShort + newInt));

        System.out.println(newLong);

    }
}
