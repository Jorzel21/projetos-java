import java.util.Scanner;

public class PairOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pairsNumbers, oddNumbers;
        int pairQuantity = 0, oddQuantity = 0;
        int numberQuantity = 0;

        System.out.println("Quantidate de números: ");
        numberQuantity = scanner.nextInt();
        int number = 0;
        for (int i = 1; i <= numberQuantity; i++) {
            System.out.println("Digite o " + i + " número: ");
            number = scanner.nextInt();

            if ((number % 2) == 0) {
                pairQuantity++;

            } else {
                oddQuantity++;

            }
        }

        System.out.println("Quantidate de números pares: " + pairQuantity);
        System.out.println("Quantidate de números impares: " + oddQuantity);

    }
}
