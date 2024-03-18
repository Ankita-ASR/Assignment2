import java.util.Scanner;
public class LetterSizePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a distance in meters: ");
        double meters = sc.nextDouble();
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.37008;
        System.out.printf("%.5f meters is equal to:\n", meters);
        System.out.printf("%.5f miles\n", miles);
        System.out.printf("%.5f feet\n", feet);
        System.out.printf("%.5f inches\n", inches);
    }
}

