package questoes;

import java.util.Scanner;

public class nome_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos");

        sc.close();
    }
}