package LacoRepeticao;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade=0, i=0, j=0;		
		
		while (idade != -99) {
			System.out.println("Informe sua idade: ");
			idade=ler.nextInt();
				if(idade<21 && idade>0) {
					j++;
				} else if (idade>50) {
					i++;
				}
		}
		System.out.printf("A quantidade de pessoas com menos de 21 é %d, e a quantidade"
				+ " de pessoas com mais de 50 é de %d.",j,i);
	}
}
