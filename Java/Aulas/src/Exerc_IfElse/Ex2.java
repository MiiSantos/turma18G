package Exerc_IfElse;

import java.util.Scanner;

public class Ex2 {
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
		
		if (num1>num2 && num1>num3 && num2>num3) {			
			System.out.println("A sequência crescente é "+num3+", "+num2+", "+num1);
		} else if (num1<num2 && num2<num3 && num2<num3) {
			System.out.println("A sequência crescente é "+num1+", "+num2+", "+num3);
		} else if (num1<num2 && num2>num3 && num1>num3) {
			System.out.println("A sequência crescente é "+num3+", "+num1+", "+num2);
		} else if (num1<num2 && num2>num3 && num1<num3) {
			System.out.println("A sequência crescente é "+num1+", "+num3+", "+num2);
		} else if (num1>num2 && num2<num3 && num1<num3) {
			System.out.println("A sequência crescente é "+num2+", "+num1+", "+num3);
		} else if (num1>num2 && num2<num3 && num1>num3) {
			System.out.println("A sequência crescente é "+num2+", "+num3+", "+num1);
		} else {
			System.out.println("A sequência é: "+num1+" "+num2+" "+num3);
		}
	}
}
