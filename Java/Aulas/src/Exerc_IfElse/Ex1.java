package Exerc_IfElse;


import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args)
	{
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		num1=ler.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2=ler.nextInt();
		System.out.println("Informe o terceiro n�mero: ");
		num3=ler.nextInt();
		
		if(num1>num2) {
			System.out.println("O primeiro n�mero � o maior: "+num1);
		} else if (num2>num3) {
			System.out.println("O segundo n�mero � o maior:  "+num2);
		} else {
			System.out.println("O terceiro n�mero � o maior: "+num3);
		}
	}

}
