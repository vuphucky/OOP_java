import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter width:");
        double width = sc.nextDouble();
        System.out.println("enter height:");
        double height = sc.nextDouble();

     Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle is:  " + rectangle.display());
        System.out.println("Area rectangle = " + rectangle.getArea());
        System.out.println("Perimeter rectangle = " + rectangle.getPerimeter());
    }
}