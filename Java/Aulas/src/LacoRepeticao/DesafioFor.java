package LacoRepeticao;

import java.util.Scanner;

public class DesafioFor {
	public static void main(String[] args)
	{
		int num;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		num=ler.nextInt();
		linha(num);
		
	}
	
	public static void linha(int num) {
		for(int x=0; x<=num; x++) {
			System.out.printf("-");
		}
	}

}
