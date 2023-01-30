import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int note = 0;
        System.out.println("Digite uma nota: ");
        note = scan.nextInt();

        while (note < 0 | note > 10) {
            System.out.println("Nota não está no intevalo entre 0 e 10");
            System.out.println("Digite novamente uma nota: ");
            note = scan.nextInt();
        }
        System.out.println(note +" é uma nota válida!");

    }
}
