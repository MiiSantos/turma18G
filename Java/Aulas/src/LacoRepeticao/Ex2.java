package LacoRepeticao;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args)
	{
		int num, par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		
		for (int x=0; x<10; x++) {
			System.out.println("Informe um n�mero inteiro: ");
			num=ler.nextInt();
			
			if (num%2==0) {
				par=par+1;
			} else {
				impar=impar+1;
			}
		}
		System.out.printf("A quantidade de n�meros pares informados � de %d, e a quantidade de "
				+ "n�meros impares � de %d. ",par, impar);
	}
}
