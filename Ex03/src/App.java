import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 5
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;

        do {
            System.out.print("Digite a nota da 1ª avaliação (entre 0 e 10): ");
            nota1 = scanner.nextDouble();
            
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota fora do intervalo válido. Tente novamente.");
            }
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a nota da 2ª avaliação (entre 0 e 10): ");
            nota2 = scanner.nextDouble();

            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota fora do intervalo válido. Tente novamente.");
            }
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}
