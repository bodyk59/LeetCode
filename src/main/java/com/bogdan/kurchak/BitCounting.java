package com.bogdan.kurchak;

/*
 * https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
 *
 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in
 * the binary representation of that number. You can guarantee that input is non-negative.
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */

/**
 * @author Bogdan Kurchak
 */
public class BitCounting {
    public static int countBits(int n){
        return (int) Integer.toBinaryString(n).chars()
                .filter(element -> (char) element == '1')
                .count();
    }
}
