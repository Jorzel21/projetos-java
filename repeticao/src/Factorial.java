import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o número que você quer o fatorial? ");
        int factorial = scan.nextInt();
        int factorialNumber = factorial;
        for (int i = 1; i < factorial; i++){
            factorialNumber = (factorialNumber * (factorial - i));
        }

        System.out.println("Fatorial: "+ factorialNumber);
    }
}
