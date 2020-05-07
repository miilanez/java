package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class numerosMaioresQueOito {

	/*
	 * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números
	 * são maiores do que 8.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner theTeclado = new Scanner(System.in);

		int numero, posicao, quantMaioresQue8 = 0;

		for (posicao = 1; posicao <= 20; posicao++) {

			System.out.print("Digite o " + posicao + "º número: ");
			numero = theTeclado.nextInt();

			if (numero > 8) {
				quantMaioresQue8 = quantMaioresQue8 + 1;
				}
//Implementei um recurso que contabiliza em tempo real a quantidade de numeros maiores que 8;
			if(quantMaioresQue8 == 1) {
				System.out.println("Atualmente, temos " + quantMaioresQue8 + " número maior que 8");
			}else if(quantMaioresQue8 >= 2) {
				System.out.println("Atualmente, temos " + quantMaioresQue8 + " números maiores que 8");
			}else {
				System.out.println("Atualmente, não temos números maiores que 8");
			}
			
//Resultado Final
		}
		if (quantMaioresQue8 >= 1) {
			System.out.println("A quantidade final de números maiores que 8 é: " + quantMaioresQue8);
		} else {
			System.out.println("Não tivemos nenhum número maior que 8");
		}

		theTeclado.close();
	}
}
