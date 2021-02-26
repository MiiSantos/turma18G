package ExIntroJava;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args)
	{
		int anos, meses, dias, idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe sua idade em anos: ");
		anos=ler.nextInt();
		System.out.println("Informe quantos meses: ");
		meses=ler.nextInt();
		System.out.println("Informe quantos dias: ");
		dias=ler.nextInt();
		
		idade=(anos*365)+(meses*30)+dias;
		
		System.out.println("Sua idade em dias é "+idade);		
	}
}
