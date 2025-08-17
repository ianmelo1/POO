package ExemplosScanner;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas provas você fez: ");
		int qtdprovas = sc.nextInt();
		
		double soma_provas = 0;
		
		for(int i=1; i<=qtdprovas; i++) {
			System.out.print("Digite a nota da prova " + i + ": ");
			double nota = sc.nextDouble();
			soma_provas += nota;
		}
		
		double media = soma_provas / qtdprovas;
		System.out.print("A sua media foi de: " + media);
		
		sc.close();
		
	}

}
