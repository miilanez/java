package estudosJava;

import java.util.Scanner;

public class calculadoraPersonalizada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operador, valor1, resultado, repeticao, valor2;
				
		Scanner leTeclado = new Scanner(System.in);
		
		System.out.println("Escolha o operador :1- Soma, 2-Subtração, 3-Multiplicação & 4-Divisão: ");
		operador = leTeclado.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = leTeclado.nextInt();
		
		System.out.println("Digite a quantidade de repetições: ");
		repeticao = leTeclado.nextInt();
		
		if(operador == 1){
			for (valor2=0; valor2<=repeticao; valor2++) {
				resultado = (valor1+valor2);
			      System.out.printf(" %2d + %d = %2d \n", valor1, valor2, resultado );
			    }
						
		}else if(operador == 2){
			for (valor2=0; valor2<=repeticao; valor2++) {
				resultado = (valor1-valor2);
			      System.out.printf(" %2d - %d = %2d \n", valor1, valor2, resultado );
			    }
			
		}else if(operador == 3){
			for (valor2=0; valor2<=repeticao; valor2++) {
				resultado = (valor1*valor2);
			      System.out.printf(" %2d * %d = %2d \n", valor1, valor2, resultado );
			    }
			    
		}else{
			for (valor2=0; valor2<=repeticao; valor2++) {
				resultado = (valor1/valor2);
			      System.out.printf(" %2d / %d = %2d \n", valor1, valor2, resultado );
			    }
		}
			
		
		
	}

}