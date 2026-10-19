
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int n = leitor.nextInt();

        int soma = 0;
        int i = 1;
        while (i <= n) {
            int numero = leitor.nextInt();
            System.out.println("Digite o numero: " + i);
            soma = soma + numero;
            i++;
        }
        System.out.println("Soma: " + soma);

        leitor.close();
    }
}
