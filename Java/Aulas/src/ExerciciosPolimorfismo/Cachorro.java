package ExerciciosPolimorfismo;

public class Cachorro extends Animal {
	private String corrida;

	public Cachorro(String nome, int idade, String som, String corrida) {
		super(nome, idade, som);
		this.corrida = corrida;
	}

	public String getCorrida() {
		return corrida;
	}

	public void setCorrida(String corrida) {
		this.corrida = corrida;
	}
	
	
}
