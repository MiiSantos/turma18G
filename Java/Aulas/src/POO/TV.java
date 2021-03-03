package POO;

public class TV {
		public boolean ligada;
		public int volume;
		public int canal;
		
		
		public void ligar() {
			ligada = true;
		}
		public void desligar() {
			ligada = false;
		}
		public void aumentarVolume() {
			if(volume>=10) {
				return;
			} volume++;			
		} 
		public void diminuirVolume() {
			if(volume>=0)
			volume--;
		}
		public void mudarCanal() {
			if(canal ==1) {
				System.out.println("Você está no canal X");
			} else if (canal == 2) {
				System.out.println("Você está no canal Y");
			} else if (canal == 3) {
				System.out.println("Você está no canal de musica");
			} else {
				return;
			}
		}
}