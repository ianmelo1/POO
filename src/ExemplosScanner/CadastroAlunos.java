package ExemplosScanner;

import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int totalAlunos = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do enter

        String[] nomes = new String[totalAlunos];
        int[] idades = new int[totalAlunos];
        double[] notas = new double[totalAlunos];

        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("\nCadastro do aluno " + (i + 1) + ":");

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();

            System.out.print("Nota: ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do enter
        }

        System.out.println("\n--- RESULTADOS ---");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Nota: " + notas[i]);
            if (notas[i] >= 6) {
                System.out.println("Situação: Aprovado!");
            } else {
                System.out.println("Situação: Reprovado!");
            }
            System.out.println("-----------------");
        }

        scanner.close();
    }
}
