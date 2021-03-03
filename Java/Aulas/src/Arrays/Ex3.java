package Arrays;
/* Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das 
matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de 
mesma posi��o das matrizes N1 e N2.*/

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		Random num = new Random();
		
		for(int l=0; l<N1.length; l++) {
			for(int c=0; c<N1.length; c++) {
				N1[l][c]=num.nextInt(9)+1;
				N2[l][c]=num.nextInt(9)+1;
				M1[l][c]=N1[l][c]+N2[l][c];
				M2[l][c]=N1[l][c]-N2[l][c];
			}
		}
	}
}
