import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number a:");
        double a = sc.nextDouble();
        System.out.println("enter number b");
        double b = sc.nextDouble();
        System.out.println("enter number c");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
         double delta = quadraticEquation.getDiscriminant();
         double root1 = quadraticEquation.getRoot1();
         double root2 = quadraticEquation.getRoot2();

        System.out.println("delta of 3 num = " + delta);

        if(delta > 0 ){
            System.out.println("PT co nghiem thu 1 = " + root1);
            System.out.println("PT co nghiem thu 2 = " + root2);
        } else if (delta == 0) {
            System.out.println("PT co 1 nghiem = " + root1);
        } else {
            System.out.println("PT vo nghiem!");
        }
    }
}