package LacoRepeticao;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args)
	{
		int num, total=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Informe um n�mero inteiro: ");
			num=ler.nextInt();
			total=total+num;
		} while (num != 0);
		System.out.printf("A soma de todos os n�meros informados � de %d.",total);
	}
}
