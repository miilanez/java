package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class somaDezNumeros {

	/*
	 * 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma
	 * desses números.
	 */

	public static void main(String[] args) {

		Scanner theTeclado = new Scanner(System.in);

		int numero = 0, soma = 0;

		for (int quantidade = 1; quantidade <= 10; quantidade++) {
			System.out.println("Por favor, informe o " + quantidade + "º número: ");
			numero = theTeclado.nextInt();

			soma += numero;
		}

		System.out.println("A soma total dos números é: " + soma);
		theTeclado.close();
	}

}