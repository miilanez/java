package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class mediaIdades {
	
	// 7) Leia a idade de 20 pessoas e exiba a média das idades.

	public static void main(String[] args) {
		
		Scanner theTeclado = new Scanner(System.in);

		int idade = 0, soma =0, media = 0;

		for (int quantidade = 1; quantidade <= 20; quantidade++) {
			System.out.println("Por favor, digite a idade da " + quantidade + "ª pessoa: ");
			idade = theTeclado.nextInt();

			media = (soma += idade)/ 20;

		}

		System.out.println("A média das idades digitadas é: " + media);
		theTeclado.close();

	}

}
