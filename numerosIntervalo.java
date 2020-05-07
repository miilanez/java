package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class numerosIntervalo {
	/* 14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0
e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.*/

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner theTeclado = new Scanner(System.in);

		int qtdeNumeros, qtdeValoresAte100 = 0, qtdeValoresAte200 = 0, qtdeMaioresQue200 = 0;
		int numero;

		for (qtdeNumeros = 1; qtdeNumeros <= 20; qtdeNumeros++) {

			System.out.println("Digite o " + qtdeNumeros + "º número: ");
			numero = theTeclado.nextInt();
					
			if(numero >=0 && numero <= 100 ) {
				qtdeValoresAte100 = qtdeValoresAte100 +1;
			}else if(numero >=101 && numero <= 200 ) {
				qtdeValoresAte100 = qtdeValoresAte200 +1;
			}else if(numero > 200) {
				qtdeMaioresQue200 = qtdeMaioresQue200 +1;
			}else {
				System.out.println("Valor não será contabilizado");
			}
			
				//Resultado Final
		}
		System.out.println("A quantidade de números no intervalo 0-100 é: " + qtdeValoresAte100);
		System.out.println("A quantidade de números no intervalo 101-200 é: " + qtdeValoresAte200);
		System.out.println("A quantidade de números maiores que 200 é: " + qtdeMaioresQue200);
		theTeclado.close();
	}

}

