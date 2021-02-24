import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args)
	{
		double x1, y1, x2, y2, p1, p2, d;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de X1: ");
		x1=ler.nextInt();
		System.out.println("Informe o valor de Y1: ");
		y1=ler.nextInt();
		System.out.println("Informe o valor de X2: ");
		x2=ler.nextInt();
		System.out.println("Informe o valor de Y2: ");
		y2=ler.nextInt();
		
		p1= Math.pow((x1+y1),2);
		p2= Math.pow((x2+y2),2);
		
		d= Math.sqrt(p1+p2);
		
		System.out.println("A distância é de: "+d);
	}
}
