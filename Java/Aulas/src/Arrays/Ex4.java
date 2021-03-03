	package Arrays;
	
	import java.util.Scanner;
	
	public class Ex4 {
		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);
			int[][] matriz = new int [3][3];
			int soma=0; 
			int diagonal=0;
			
			for(int l=0; l<matriz.length; l++) {
				for(int c=0; c<matriz.length; c++) {
					System.out.printf("\nDigite um valor: ");
					matriz[l][c]=ler.nextInt();
				}
			}
				for(int l=0; l<matriz.length; l++) {
					for(int c=0; c<matriz.length; c++) {
						System.out.printf("[ %d ]\t",matriz[l][c]);
						if (c == 2 ) {
							System.out.println(" ");
						}
						soma=soma+matriz[l][c];
						diagonal=matriz[0][0]+matriz[1][1]+matriz[2][2];
					}
				}
				System.out.printf("A soma da matriz é %d, e a soma da diagonal é %d.",soma,diagonal);
		}
	}
