package mathematicalalgorithm;

import java.util.Scanner;

/**
 * The HCF class provides a method to compute the Highest Common Factor (HCF),
 * also known as the Greatest Common Divisor (GCD), of two integers using
 * the Euclidean algorithm. This method is efficient and works in 
 * O(log(min(num1, num2))) time complexity.
 */

public class HCF {
/**
     * Calculates the Highest Common Factor (HCF) of two integers.
     *
     * This method uses the Euclidean algorithm, which relies on the principle that
     * the HCF of two numbers does not change if the larger number is replaced 
     * by its remainder when divided by the smaller number. This process continues
     * iteratively until one of the numbers becomes zero, at which point the other 
     * number is the HCF.
     *
     * Example:
     * <pre>
     *     int result = HCF.getHFC(48, 18);
     *     // result will be 6, as 6 is the largest number that divides both 48 and 18.
     * </pre>
     */

    static int getHFC(int num1, int num2){
        while (num2 != 0) {
            int temp = num2; // Store the current value of num2
            num2 = num1 % num2; // Replace num2 with the remainder of num1 divided by num2
            num1 = temp; // Update num1 to the previous value of num2
        }
        return num1; // When num2 becomes 0, num1 contains the HCF
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("HCF = " + getHFC(a, b));

        sc.close();
    }
}