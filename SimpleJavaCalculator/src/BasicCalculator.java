/*
    @author: Aayush Gulia
    @name = BasicCalculator.java
    @Git: https://github.com/Aayush000001/SimpleJavaCalculator/blob/master/src/Calculator.java
    @contact: aayushgulia07@outlook.com
 */

import java.util.Locale;
import java.util.Scanner;

public class BasicCalculator {
    Scanner scan = new Scanner(System.in);

    //menu

    public void showMenu(){
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
    }

    public double Addition(){
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first number: ");
        a = scan.nextDouble();
        System.out.println("Enter second number: ");
        b = scan.nextDouble();

        //logic

        double val = a+b;
        return val;
    }

    public double Subtraction(){
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first number: ");
        a = scan.nextDouble();
        System.out.println("Enter second number: ");
        b = scan.nextDouble();

        //logic

        double val = a-b;
        return val;
    }

    public double Multiplication(){
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first number: ");
        a = scan.nextDouble();
        System.out.println("Enter second number: ");
        b = scan.nextDouble();


        //logic

        double val = a*b;
        return val;
    }

    public double Division(){
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first number");
        a = scan.nextDouble();
        System.out.println("Enter second number");
        b = scan.nextDouble();


        //logic

        double val = a/b;
        return val;
    }

    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        Scanner scan = new Scanner(System.in);

        int x;
        double ans;
        calc.showMenu();
        x = scan.nextInt();

        switch (x){
            case 1:
                ans = calc.Addition();
                System.out.println(ans);
                break;

            case 2:
                ans = calc.Subtraction();
                System.out.println(ans);
                break;

            case 3:
                ans = calc.Multiplication();
                System.out.println(ans);
                break;

            case 4:
                ans = calc.Division();
                System.out.println(ans);
                break;

            default:
                System.out.println("Invalid response");
                break;
        }
    }
}
