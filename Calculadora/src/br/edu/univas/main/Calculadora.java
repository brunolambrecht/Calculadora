package br.edu.univas.main;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			menu();
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				somar();
				break;

			case 2:
				subtrair();
				break;

			case 3:
				multiplicar();
				break;

			case 4:
				dividir();
				break;

			case 9:
				fim();
				break;

			default:
				System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
			}
		} while (opcao != 0 || opcao == 0);
	}

	public static void menu() {
		
		System.out.println("\t\n		Calculadora");
		System.out.println("\n        =========================");
		System.out.println("	|     1. Somar		|");
		System.out.println("	|     2. Subtrair	|");
		System.out.println("	|     3. Multiplicar	|");
		System.out.println("	|     4. Dividir	|");
		System.out.println("	|     9. Fim		|");
		System.out.println("        =========================\n");

		System.out.println("Escolha uma op��o");
	}
	
	public static void continuar() {
		System.out.println("\nPrecione enter para voltar ao menu");
		Scanner entradaatoa = new Scanner(System.in);
		entradaatoa.nextLine();
		
	}

	public static void somar() {
		System.out.println("Voc� escolheu a op��o somar");	
			double x = 0;
			double y = 0;
			double z = 0;
		System.out.println("\nInforme o primeiro numero: ");
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		Scanner entrada2 = new Scanner(System.in);
		y = entrada2.nextDouble();
		
		z = x + y;
		System.out.println("A soma de " + x + " por " + y + " � igual a: " + z);
		
		continuar();
		
	}

	public static void subtrair() {
		System.out.println("Voc� escolheu a op��o subtrair");
			double x = 0;
			double y = 0;
			double z = 0;
		System.out.println("\nInforme o primeiro numero: ");
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		Scanner entrada2 = new Scanner(System.in);
		y = entrada2.nextDouble();
		
		z = x - y;
		System.out.println("A subtra��o de " + x + " por " + y + " � igual a: " + z);
		
		continuar();
		
	}

	public static void multiplicar() {
		System.out.println("Voc� escolheu a op��o multiplicar");
			double x = 0;
			double y = 0;
			double z = 0;
		System.out.println("\nInforme o primeiro numero: ");
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		Scanner entrada2 = new Scanner(System.in);
		y = entrada2.nextDouble();
		
		z = x * y;
		System.out.println("A multiplica��o de " + x + " por " + y + " � igual a: " + z);
		
		continuar();
		
	}

	public static void dividir() {
		System.out.println("Voc� escolheu a op��o dividir");
			double x = 0;
			double y = 0;
			double z = 0;
		
		System.out.println("\nInforme o primeiro numero: ");
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		Scanner entrada2 = new Scanner(System.in);
		y = entrada2.nextDouble();

		if (y > 0 || y < 0) {
			z = x / y;
			System.out.println("A divis�o de " + x + " por " + y + " � igual a: " + z);
			
			continuar();
			
			
		} else {
			System.out.println("Impossivel dividir por 0. Informe um numero diferente de 0.");
			System.out.println("Precione qualquer tecla para recome�ar");
			Scanner entradaatoa = new Scanner(System.in);
			entradaatoa.nextLine();
			dividir();
			
		}
		
	}
	
	public static void fim() {
		System.out.println("A calculadora foi fechada");
		System.exit(0);
		
	}
}
