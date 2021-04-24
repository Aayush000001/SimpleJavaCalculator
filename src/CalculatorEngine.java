import java.util.Scanner;

public class CalculatorEngine {
    public void showMenu(){
        System.out.println("--------------------");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("9.Exit");
        System.out.println("--------------------");

    }
    public double addition(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Adding two numbers");
        double a,b;
        System.out.println("----------");
        System.out.println("Enter first number: ");
        a = scan.nextDouble();
        System.out.println("----------");
        System.out.println("Enter second number: ");
        b = scan.nextDouble();
        double ans = a + b;
        return ans;
    }

    public double subtraction(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Subtracting two numbers");
        double a,b;
        System.out.println("----------");
        System.out.println("Enter first number");
        a = scan.nextDouble();
        System.out.println("----------");
        System.out.println("Enter second number");
        b = scan.nextDouble();
        double ans = a - b;
        return ans;
    }

    public double multiplication(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Multiply two numbers");
        double a,b;
        System.out.println("----------");
        System.out.println("Enter first number");
        a = scan.nextDouble();
        System.out.println("----------");
        System.out.println("Enter second number");
        b = scan.nextDouble();
        double ans = a * b;
        return ans;
    }

    public double division(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Dividing two numbers");
        double a,b;
        System.out.println("----------");
        System.out.println("Enter first number");
        a = scan.nextDouble();
        System.out.println("----------");
        System.out.println("Enter second number");
        b = scan.nextDouble();
        double ans = a / b;
        return ans;
    }
}
