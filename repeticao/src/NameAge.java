import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        while (true) {
            System.out.println("Nome: ");
            name = scan.next();
            if(name.equals("0"))
                break;

            System.out.println("Idade: ");
            age = scan.nextInt();
        }

    }
}
