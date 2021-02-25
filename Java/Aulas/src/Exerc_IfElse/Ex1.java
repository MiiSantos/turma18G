package Exerc_IfElse;


import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args)
	{
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		num1=ler.nextInt();
		System.out.println("Informe o segundo número: ");
		num2=ler.nextInt();
		System.out.println("Informe o terceiro número: ");
		num3=ler.nextInt();
		
		if(num1>num2) {
			System.out.println("O primeiro número é o maior: "+num1);
		} else if (num2>num3) {
			System.out.println("O segundo número é o maior:  "+num2);
		} else {
			System.out.println("O terceiro número é o maior: "+num3);
		}
	}

}
