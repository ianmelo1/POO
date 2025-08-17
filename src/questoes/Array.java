package questoes;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  int[] numeros = new int[5];

	        System.out.println("Digite 5 números inteiros:");

	        for(int i = 0; i < 5; i++) {
	            System.out.print("Número " + (i+1) + ": ");
	            numeros[i] = sc.nextInt();
	        }

	        System.out.println("Os números digitados foram:");
	        for(int i = 0; i < 5; i++) {
	            System.out.println(numeros[i]);
	        }

	        sc.close();

	}

}
