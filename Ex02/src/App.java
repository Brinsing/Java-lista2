import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 02
         Scanner scanner = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor (não pode ser zero): ");
        valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.println("O segundo valor não pode ser zero. Tente novamente.");
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        }

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();


    }
}
