package countBit;

/*
* Write a function that takes an integer as input,
* and returns the number of bits that are equal to one in the binary representation of that number.
* You can guarantee that input is non-negative.
* Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */

import java.util.Arrays;
import java.util.Scanner;

public class bitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer number: ");
        int number = Math.abs((int)input.nextDouble());
        System.out.println(bitCounting(number)); // my function
        System.out.println(Integer.bitCount(number)); // or the faster classic way
    }

    public static int bitCounting(int number) {
        String stringValue = Integer.toBinaryString(number);
        char[] charArray = stringValue.toCharArray();
        int bitCounter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(Character.getNumericValue(charArray[i]) == 1) {
                bitCounter++;
            }
        }
        return bitCounter;
    }
}
