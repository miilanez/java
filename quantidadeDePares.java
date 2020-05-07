package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class quantidadeDePares {
	
	/*12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números
são pares */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner theTeclado = new Scanner(System.in);

		int qtdeNumeros, qtdePares = 0, numero;

		for (qtdeNumeros = 1; qtdeNumeros <= 20; qtdeNumeros++) {

			System.out.println("Digite o " + qtdeNumeros + "º número: ");
			numero = theTeclado.nextInt();
					
			if(numero % 2 == 0) {
				qtdePares = qtdePares + 1;
			}
	//Seguindo o exemplo da atividade anterior, implementei novamente o recurso de 
		//contagem em tempo real dos valores pares
			if(qtdePares == 1) {
				System.out.println("Atualmente, temos " + qtdePares + " número par");
			}else if(qtdePares >= 2) {
				System.out.println("Atualmente, temos " + qtdePares + " números pares");
			}else {
				System.out.println("Atualmente, não temos números pares");
			}
			// Resultado Final
		}
		System.out.println("A quantidade de números pares foi: " + qtdePares);
		theTeclado.close();
	}

}
