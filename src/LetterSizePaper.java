
/*2 Write a program that reads a number and displays the square, cube, and fourth
power. Use the Math.pow method only for the fourth power.*/

import java.util.Scanner;

public class LetterSizePaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double square = number* number ;
        double cube =  number* number* number;
        double fourthPower = Math.pow(number, 4);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);
    }
}

