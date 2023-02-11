import java.util.Scanner;

public class second{

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first side value");
        double x=scanner.nextDouble();
        System.out.println("Enter the second side value");
        double y=scanner.nextDouble();

        double z=Math.sqrt((x*x)+(y*y));
        
        System.out.println("The hypotenuse of the triangle is "+z);
        scanner.close();
    }
}