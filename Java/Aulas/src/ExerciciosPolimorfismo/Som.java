package ExerciciosPolimorfismo;

public class Som {

	public static void main(String[] args) {
		
		Animal preguica = new Animal("bicho-preguica", 4, "nhonhoc");
		Animal cachorro = new Animal("c�o", 10, "auau");
		Animal cavalo = new Animal("cavalo", 8, "inhohoho");
		
		System.out.println("A pregui�a faz "+preguica.getSom());
		System.out.println("O cachorro faz "+cachorro.getSom());
		System.out.println("O cavalo faz "+cavalo.getSom());
	}

}
