package POO;

public class UsarTv {

	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.ligar();
		System.out.println("A televisão está ligada?");
		if(tv1.ligada == true) {
			System.out.println("Tv ligada!");
		} else {
			System.out.println("Tv desligada!");
		}
		System.out.println("O volume da tv é "+tv1.volume);
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		System.out.println("O volume da tv é "+tv1.volume);
		tv1.canal = 3;
		tv1.mudarCanal();
	}
}
