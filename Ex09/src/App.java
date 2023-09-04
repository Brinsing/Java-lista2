import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 19

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int numeroAlunos = scanner.nextInt();

        if (numeroAlunos <= 0) {
            System.out.println("Número de alunos inválido. Deve ser maior que zero.");
            scanner.close();
            return;
        }

        double somaNotas = 0;

        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / numeroAlunos;
        System.out.println("A média aritmética das notas é: " + media);

        scanner.close();
    }
}
