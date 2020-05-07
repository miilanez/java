package exercicios.comandos.de.repeticao;

import java.util.Scanner;

public class nomeUsuarioNVezes {

	// 4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N
	// vezes.
	
	public static void main(String[] args) {
		
		Scanner theTeclado = new Scanner(System.in);
		
		String nome;
		int numero, repeticao;
		
		System.out.println("Por favor, digite um nome: ");
		nome = theTeclado.next();
		
		System.out.println("Por favor, digite um numero: ");
		numero = theTeclado.nextInt();
		
		System.out.println("Por favor, digite quantas vezes deseja repetir: ");
		repeticao = theTeclado.nextInt();
		
		for(int repeteco = 1; repeteco <= repeticao; repeteco ++) {
			System.out.println(repeteco + "ª repetição: O nome do usuário é: " + nome );
			System.out.println(" O número deste usuário é: " + numero);
		}
		
		theTeclado.close();
		
		/*Mestre, como comentário pessoal da questão, eu não consegui entender se o objetivo
		seria repetir o algorítmo varias vezes inserindo usuários diferentes ou da 
		maneira que executei, repetindo o mesmo usuario e seu numero N vezes; */
	}

}
