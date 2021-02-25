package Exerc_IfElse;


import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args)
	{
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro positivo: ");
		numero=ler.nextInt();
		
		if (numero % 2 == 0) 
		{
			System.out.println("O número informado é par");
		} else {
			System.out.println("O número informado é ímpar");
		}
	}
}
