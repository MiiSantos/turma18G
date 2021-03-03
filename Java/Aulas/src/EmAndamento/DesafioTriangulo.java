package EmAndamento;

import java.util.Scanner;

public class DesafioTriangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base1, base2, base3, alt1, alt2, alt3;
		double res1, res2, res3, maior=0;
		
		System.out.println("Informe a base do triangulo 1: ");
		base1=ler.nextDouble();
		System.out.println("Informe a altura do triangulo 1: ");
		alt1=ler.nextDouble();
		System.out.println("Informe a base do triangulo 2: ");
		base2=ler.nextDouble();
		System.out.println("Informe a altura do triangulo 2: ");
		alt2=ler.nextDouble();
		System.out.println("Informe a base do triangulo 3: ");
		base3=ler.nextDouble();
		System.out.println("Informe a altura do triangulo 3: ");
		alt3=ler.nextDouble();
		
		res1=(base1*alt1)/2;
		res2=(base2*alt2)/2;
		res3=(base3*alt3)/2;
		
		if (res1>res2 && res2>res3) {
			maior=res1;
		} else if (res1<res2 && res2<res3) {
			maior=res3;
		} else if (res1<res2 && res2>res3) {
			maior=res2;
		}
		
		System.out.printf("A área do tringulo 1 é %.1f.", res1);
		System.out.printf("\nA área do tringulo 2 é %.1f.", res2);
		System.out.printf("\nA área do tringulo 3 é %.1f.", res3);
		System.out.printf("\nA maior área é %.1f.", maior);		
	}
}
