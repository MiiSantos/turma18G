package Exerc_IfElse;



import java.util.Scanner;

public class DesafioSe {
	public static void main(String[] args)
	{
		int idade;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Ol�, informe sua idade: ");
		idade=ler.nextInt();
		
		if (idade>=5 && idade<=7) {
			System.out.println("Sua categoria � Infantil A");
		} else if (idade>=8 && idade<=11) {
			System.out.println("Sua categoria � Infantil B");
		} else if (idade>=12 && idade<=13) {
			System.out.println("Sua categoria � Juvenil A");
		} else if (idade>=14 && idade<=17) {
			System.out.println("Sua categoria � Juvenil B");
		} else if (idade>=18) {
			System.out.println("Sua categoria � Aduldo");
		} else {
			System.out.println("Voc� n�o tem idade para nadar!");
		}
	}
}
