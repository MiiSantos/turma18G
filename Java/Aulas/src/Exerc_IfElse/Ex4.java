package Exerc_IfElse;


import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args)
	{
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro positivo: ");
		numero=ler.nextInt();
		
		if (numero % 2 == 0) 
		{
			System.out.println("O número informado é par");
			System.out.println("Sua raiz quadrada é "+Math.sqrt(numero));
		} else {
			System.out.println("O número informado é ímpar");
			System.out.println("Esse número elevado ao quadrado é: "+Math.pow(numero, 2));
		}
	}
}
