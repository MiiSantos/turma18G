import java.util.Scanner;

public class calculaMedia {
	
	public static void main(String[] args) 
	{
		float media=0;
		int n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("�la informe sua primeira nota: ");
		n1=ler.nextInt();
		System.out.println("�la informe sua segunda nota: ");
		n2=ler.nextInt();
		System.out.println("�la informe sua terceira nota: ");
		n3=ler.nextInt();
		
		media=(n1+n2+n3)/3;
		System.out.println("Sua m�dia � de: "+media);
		
	}
}
