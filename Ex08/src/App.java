import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 13
        Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Digite um valor inteiro entre 1 e 10: ");
            valor = scanner.nextInt();

            if (valor < 1 || valor > 10) {
                System.out.println("Valor fora do intervalo permitido. Tente novamente.");
            }
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada de " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

        scanner.close();



    }
}
