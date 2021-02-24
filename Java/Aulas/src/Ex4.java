import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args)
	{
		double A, B, C, D, R, S;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		A=ler.nextDouble();
		System.out.println("Informe um número: ");
		B=ler.nextDouble();
		System.out.println("Informe um número: ");
		C=ler.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		
		D = (R+S)/2;
		
		System.out.println(D);
	}
}
