package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class somaIdades {

	// 6) Leia a idade de 20 pessoas e exiba a soma das idades.

	public static void main(String[] args) {

		Scanner theTeclado = new Scanner(System.in);

		int idade = 0, soma = 0;

		for (int quantidade = 1; quantidade <= 20; quantidade++) {
			System.out.println("Por favor, digite a idade da " + quantidade + "ª pessoa: ");
			idade = theTeclado.nextInt();

			soma += idade;

		}

		System.out.println("A soma das idades digitadas é: " + soma);
		theTeclado.close();
	}

}
