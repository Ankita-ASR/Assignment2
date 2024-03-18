import java.util.Scanner;
public class LetterSizePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = 3.14 * Math.pow(radius, 2);
        double circumference = 2 * 3.14 * radius;
        double volume = (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
        double surfaceArea = 4 * 3.14 * Math.pow(radius, 2);
        System.out.printf("Area of circle: %.2f \n", area);
        System.out.printf("Circumference of circle: %.2f \n", circumference);
        System.out.printf("Volume of Sphere : %.2f \n", volume);
        System.out.printf("Surface Area of Sphere: %.2f \n", surfaceArea);
    }
}
