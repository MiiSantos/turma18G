package LacoRepeticao;

import java.util.Scanner;

public class NegativoPara {
	public static void main(String[] args) 
	{
		int num, maior=0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Informe um n�mero inteiro: ");
			num=ler.nextInt();
			if (num>maior) {
				maior=num;
			}
		} while (num>=0);
			System.out.printf("O maior n�mero foi %d",maior);
	}
}
