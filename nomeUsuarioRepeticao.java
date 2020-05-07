package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class nomeUsuarioRepeticao {

	// 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
	
	public static void main(String[] args) {
		
		Scanner theTeclado = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Por favor, digite o seu nome: ");
		nome = theTeclado.next();
		
		for(int repeticao = 1; repeticao <= 10;repeticao ++) {
			System.out.println(repeticao + ". Seu nome é " + nome);
		}
		theTeclado.close();
	}

}
