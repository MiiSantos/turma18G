package LacoRepeticao;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int num, x=0, media=0, n=0;
		
		do {
			System.out.println("Informe um número inteiro: ");
			num=ler.nextInt();
			if (num%3==0) {
				n=n+1;
				x=x+num;
				media=x/n;
			}
		} while (num != 0);
		System.out.printf("A media dos múltiplos de 3 é %d",media);
		System.out.printf("\n %d %d",n,x);
	}
}
