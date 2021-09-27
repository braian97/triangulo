package exercicio1;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("DESCOBRINDO O TRIANGULO");
		
		
		
		System.out.println("Digite o lado 1: ");
		float lado1 = teclado.nextFloat();
		System.out.println("Digite o lado 2: ");
		float lado2 = teclado.nextFloat();
		System.out.println("Digite o lado 3: ");
		float lado3 = teclado.nextFloat();
		
		if (lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado1 + lado3){
			System.out.println("Trata-se de um triangulo");
		} else
			System.out.println("Não é um triangulo");
		
			
		 if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
			 System.out.println("Triangulo Equilátero");
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Triangulo Isósceles");
        }else
        	System.out.println("Triangulo Escaleno");
		teclado.close();
	}

}