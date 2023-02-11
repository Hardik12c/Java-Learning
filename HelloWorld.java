import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");

        String name=scanner.nextLine();

        System.out.println("Hello "+name);

        System.out.println("What is your age");

        int age=scanner.nextInt();

        System.out.println("Your are "+age+" Years old");
        // System.out.println("Hello");
        // System.out.println("Good morning");
        scanner.close();
    }
}