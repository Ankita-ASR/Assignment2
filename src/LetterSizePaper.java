import java.util.Scanner;
public class LetterSizePaper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1st value: ");
        int first = sc.nextInt();
        System.out.print("Please enter 2nd value: ");
        int second = sc.nextInt();
        double sum = (first + second);
        double difference = (first - second);
        double product = (first * second);
        double average = (first + second)/2;
        double distance = Math.abs(difference);
        double max = Math.max(first, second);
        double min = Math.min(first, second);
        System.out.println("Summation: " + sum);
        System.out.println("Difference: "+ difference);
        System.out.println("Product: "+ product);
        System.out.println("Average: "+ average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);
    }
}

