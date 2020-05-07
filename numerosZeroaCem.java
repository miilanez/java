package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class numerosZeroaCem {

	/*
	 * 13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
	 * entre 0 e 100.
	 */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner theTeclado = new Scanner(System.in);

		//Chamei de "qtdeValores" a variavel que conta quantos numeros estão ente 0 e 100
		int qtdeNumeros, qtdeValores = 0, numero;

		for (qtdeNumeros = 1; qtdeNumeros <= 20; qtdeNumeros++) {

			System.out.println("Digite o " + qtdeNumeros + "º número: ");
			numero = theTeclado.nextInt();
					
			if(numero >=0 && numero <= 100 ) {
				qtdeValores = qtdeValores +1;
			}
			//Seguindo o exemplo da atividade anterior, implementei novamente o recurso de 
			//contagem em tempo real dos valores entre 0 e 100
				if(qtdeValores == 1) {
					System.out.println("Atualmente, temos " + qtdeValores + " número entre 0 e 100");
				}else if(qtdeValores >= 2) {
					System.out.println("Atualmente, temos " + qtdeValores + " números entre 0 e 100");
				}else {
					System.out.println("Atualmente, não temos números entre 0 e 100");
				}
				
				//Resultado Final
		}
		System.out.println("A quantidade de números no intervalo 0-100 é: " + qtdeValores);
		theTeclado.close();
	}

}
