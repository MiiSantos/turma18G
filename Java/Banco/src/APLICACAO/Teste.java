	package APLICACAO;
	
	import java.util.Scanner;
	
	import CLASSES.Conta;
	
	public class Teste {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			Conta conta1 = new Conta(347);
			double valor;
			char opcao;
			
			System.out.println("Digite um valor");
			valor=leia.nextDouble();
			System.out.println("D-Debito ou C-crédito? ");
			opcao=leia.toString().toUpperCase().charAt(0);
			
			if(opcao == 'D') {
				conta1.debito(valor);
			} else if(opcao == 'C') {
				conta1.credito(valor);
			} else {
				System.out.println("Opção inválida!");
			}
			System.out.println("Saldo atual: "+conta1.getSaldo());
		}
	
	}
