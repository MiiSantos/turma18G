package ExerciciosPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class CriarEstoque {

	public static void main(String[] args) 
	{
		Collection<String> pecas = new ArrayList();
		pecas.add("camisas");
		pecas.add("bermudas");
		pecas.add("cal�as");
		pecas.add("gravatas");
		
		System.out.println("Lista de pe�as no estoque: "+pecas);
		
		pecas.remove("bermudas");
		
		System.out.println("Lista de pe�as no estoque: "+pecas);

	}

}
