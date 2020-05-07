package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class tabuadaMultiplicacao {
	
	/* 10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
			multiplicação. */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner theTeclado = new Scanner(System.in);
		
		int numero, resultado, multiplicador = 1;
		
		System.out.println("Escolha um numero: ");
		numero = theTeclado.nextInt();
		
		System.out.println("# Tabuada de Multiplicação #");
		
		for(multiplicador = 1; multiplicador <= 10; multiplicador ++) {
			
			resultado = numero * multiplicador;
			System.out.println("# " + numero + " x " + multiplicador + " = " + resultado + " #");
			
		}
		
		theTeclado.close();
		
	}

}
