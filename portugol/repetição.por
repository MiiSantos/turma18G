programa
{
	
	funcao inicio()
	{
		inteiro ano = 0
		cadeia nome
		caracter parar = 'S'

			enquanto (parar != 'N') {
				escreva("Qual o nome do usuario? ")
				leia(nome)
				escreva("Qual o ano de nascimento do usuario? ")
				leia(ano)
				escreva("Seu nome é ",nome," e sua idade aproximada é ", 2021 - ano)
				escreva("Deseja continuar? (S/N) ")
				leia(parar)
		}
					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */