package Exerc_IfElse;

import java.util.Scanner;

public class Ex2 {
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
		
		if (num1>num2 && num1>num3 && num2>num3) {			
			System.out.println("A sequ�ncia crescente � "+num3+", "+num2+", "+num1);
		} else if (num1<num2 && num2<num3 && num2<num3) {
			System.out.println("A sequ�ncia crescente � "+num1+", "+num2+", "+num3);
		} else if (num1<num2 && num2>num3 && num1>num3) {
			System.out.println("A sequ�ncia crescente � "+num3+", "+num1+", "+num2);
		} else if (num1<num2 && num2>num3 && num1<num3) {
			System.out.println("A sequ�ncia crescente � "+num1+", "+num3+", "+num2);
		} else if (num1>num2 && num2<num3 && num1<num3) {
			System.out.println("A sequ�ncia crescente � "+num2+", "+num1+", "+num3);
		} else if (num1>num2 && num2<num3 && num1>num3) {
			System.out.println("A sequ�ncia crescente � "+num2+", "+num3+", "+num1);
		} else {
			System.out.println("A sequ�ncia �: "+num1+" "+num2+" "+num3);
		}
	}
}
