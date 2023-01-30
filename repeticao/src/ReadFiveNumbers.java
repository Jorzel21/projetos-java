import java.util.Scanner;

public class ReadFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int bigNumber = 0;
        int count = 0;
        int soma = 0;
        do {
            System.out.println("Número: ");
            number = scan.nextInt();
            if (number > bigNumber)
                bigNumber = number;

            soma += number;
            count++;
        } while (count < 5);

        System.out.println("Maior: " + bigNumber);

        System.out.println("Média: " + (soma / 5));
    }
}
