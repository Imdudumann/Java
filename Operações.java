import java.util.Scanner;

import mat.calculadora;

public class Operações {

	public static void main(String[] args) {
		
		calculadora calculadora = new calculadora();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		calculadora.a = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		calculadora.b = sc.nextInt();
		System.out.println("[1] SOMA");
		System.out.println("[2] SUBTRAÇÃO");
		System.out.println("[3] MULTIPLICAÇÃO");
		System.out.println("[4] DIVISÃO");
		System.out.print("Digite a operação desejada: ");
		int escolha = sc.nextInt();
		int resultado = 0;
		
		if (escolha == 1) {
			resultado = calculadora.soma(calculadora.a,calculadora.b);
			System.out.println("O resultado da soma é: "+resultado);
		}else if (escolha == 2) {
			resultado = calculadora.subtracao(calculadora.a, calculadora.b);
			System.out.println("O resultado da subtração é: "+resultado);
		}else if (escolha == 3) {
			resultado = calculadora.multiplicacao(calculadora.a, calculadora.b);
			System.out.println("O resultado da multiplicação é: "+resultado);
		}else {
			resultado = calculadora.divisao(calculadora.a, calculadora.b);
			System.out.println("O resultado da divisão é: "+resultado);
		}
		
		
		sc.close();

	}

}
