import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Qual o número que você que ver a tabuada? ");
        int table = scan.nextInt();

        System.out.println("Tabuada de "+ table);
        for (int i = 0; i < 11; i++){
            System.out.println(table+" x "+ i + " = " + (i * table));
        }
    }
}
