import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    // 4 operations +,-,*,/

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


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double val;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double count = 0;

        while(true){
            calc.showMenu();
            count = scan.nextInt();
            if (count == 1){
                val = calc.addition();
                System.out.println("");
                System.out.println(val);
            }
            if (count == 2){
                val = calc.subtraction();
                System.out.println("");
                System.out.println(val);
            }
            if (count == 3){
                val = calc.multiplication();
                System.out.println("");
                System.out.println(val);
            }
            if (count == 4){
                val = calc.division();
                System.out.println("");
                System.out.println(val);
            }
            if (count == 9){
                System.out.println("Exited ");
                break;
            }
        }
    }
}
