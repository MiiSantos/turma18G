package Exerc_IfElse;


import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args)
	{
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro positivo: ");
		numero=ler.nextInt();
		
		if (numero % 2 == 0) 
		{
			System.out.println("O n�mero informado � par");
			System.out.println("Sua raiz quadrada � "+Math.sqrt(numero));
		} else {
			System.out.println("O n�mero informado � �mpar");
			System.out.println("Esse n�mero elevado ao quadrado �: "+Math.pow(numero, 2));
		}
	}
}
