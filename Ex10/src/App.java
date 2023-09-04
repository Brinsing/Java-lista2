import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 20
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        System.out.println("A soma total dos números é: " + soma);

        scanner.close();



    }
}
