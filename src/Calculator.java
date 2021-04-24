import java.util.Locale;
import java.util.Scanner;

public class Calculator extends CalculatorEngine{
    // 4 operations +,-,*,/

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
                System.out.println("Exited");
                break;
            }
            else{
                System.out.println("Please enter a valid input");
            }
        }
    }
}
