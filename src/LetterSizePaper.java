import java.util.Scanner;
public class LetterSizePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.printf("Area: %.2f \n", area);
        System.out.printf("Perimeter: %.2f \n", perimeter);
        System.out.printf("Length of Diagonal: %.2f \n", diagonal);
    }
}