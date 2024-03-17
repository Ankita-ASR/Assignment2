
/*Write a program that displays the properties of a letter-size (8.5 × 11 inches) sheet of
paper in millimeters. There are 25.4 millimeters per inch. The program should print:
• The width and height
• The perimeter
• The length of the diagonal*/
public class LetterSizePaper {
    public static void main(String [] args) {
        double width = 8.5 * 25.4;
        double height = 11 * 25.4;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("Width: " + width + " mm");
        System.out.println("Height: " + height + " mm");
        System.out.println("Perimeter: " + perimeter + " mm");
        System.out.println("Diagonal : " + diagonal + " mm");
    }
}

