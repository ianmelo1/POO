package ExemplosScanner;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        int num1 = sc.nextInt();

		        System.out.print("Digite o segundo número: ");
		        int num2 = sc.nextInt();

		        System.out.println("Escolha a operação: ");
		        System.out.println("1 - Soma");
		        System.out.println("2 - Subtração");
		        System.out.println("3 - Multiplicação");
		        System.out.println("4 - Divisão");
		        int opcao = sc.nextInt();

		        int resultado = 0; 

		        switch(opcao) {
		            case 1:
		                resultado = num1 + num2;
		                break;
		            case 2:
		                resultado = num1 - num2;
		                break;
		            case 3:
		                resultado = num1 * num2;
		                break;
		            case 4:
		                if(num2 != 0) {
		                    resultado = num1 / num2;
		                } else {
		                    System.out.println("Erro: divisão por zero!");
		                    sc.close();
		                    return; 
		                }
		                break;
		            default:
		                System.out.println("Opção inválida!");
		                sc.close();
		                return; 
		        }

		        System.out.println("Resultado: " + resultado);

		        sc.close();
		    }
		}