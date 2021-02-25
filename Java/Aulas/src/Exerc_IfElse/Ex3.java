package Exerc_IfElse;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) 
	{
		int idade;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Olá, informe sua idade: ");
		idade=ler.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Sua categoria é Infantil");
		} else if (idade>=15 && idade<=17) {
			System.out.println("Sua categoria é Juvenil");
		} else if (idade>=18 && idade<=25) {
			System.out.println("Sua categoria é Aduldo");
		} else {
			System.out.println("Você não se enquadra em nenhuma categoria!");
		}
	}
}
