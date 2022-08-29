import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Contador();

    }

    public static void Contador() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
}
