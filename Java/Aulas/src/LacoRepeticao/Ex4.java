package LacoRepeticao;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade, i=0, calma=0, nerv=0, agressivoH=0, calmoO=0, nerv40=0, calmoM=0;
		char genero=0, humor=0;
		
		while (i<5) {
			System.out.println("Informe sua idade: ");
			idade=ler.nextInt();
			System.out.println("Informe seu gênero F-feminino/M-masculino/O-outro: ");
			genero=ler.next().toUpperCase().charAt(0);
			System.out.println("Digite 1, para calma; 2, para nervosa e 3, para agressiva.");
			humor=ler.next().toUpperCase().charAt(0);
			
			if (genero == 'F' && humor == '2') {
				nerv++;
			}
			if (humor == '1') {
				calma++;
			} 
			if (genero == 'H' && humor == '3') {
				agressivoH++;
			}
			if (genero == 'O' && humor == '1') {
				calmoO++;
			} 
			if (humor == '2' && idade>40) {
				nerv40++;
			}
			if (idade<18 && humor == '1') {
				calmoM++;
			}
			i++;
		}
		System.out.printf("Total de pessoas calmas %d \n Total de mulheres nervosas %d \n",calma,nerv);
		System.out.printf("Total de homens agressivos %d \n Total de outros calmos %d \n",agressivoH,calmoO);
		System.out.printf("Total de pessoas nervosas acima de 40 anos %d \n Total de pessoas calamas "
				+ "com menos de 18 anos %d \n",nerv40,calmoM);
	}
}
