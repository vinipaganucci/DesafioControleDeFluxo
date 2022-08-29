import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        try {
            Contante();
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro não pode ser maior que o segundo");
            
        }
        
    }

    public static void Contante() throws ParametrosInvalidosException {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();
        scanner.close();

        if (n1 > n2) {
            throw new ParametrosInvalidosException();
            

        }

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }

        
    }
}
