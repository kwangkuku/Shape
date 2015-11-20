
import java.util.Scanner;

public class TestDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sphere ---");
        System.out.print("Enter Radius : ");
        int i = sc.nextInt();

        Sphere s = new Sphere(i);
        System.out.println("Volume of Sphere is " + s.volume());
        System.out.println("Area of Sphere is " + s.area());


        System.out.println("");

        
        System.out.println("--- Cube ---");
        System.out.print("Enter Length : ");
        int j = sc.nextInt();

        Cube c = new Cube(j);
        System.out.println("Volume of Cube is " + c.volume());
        System.out.println("Area of Cube is " + c.area());




    }
}
