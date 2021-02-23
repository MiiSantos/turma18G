programa
{
	
	funcao inicio()
	{
		real soma = 0.0, notas = 0.0

		para (inteiro x = 0; x < 4; x++) {
			escreva("Informe sua nota: ")
			leia(notas)

			soma = soma + notas
		}
		escreva("Sua média é: ", soma/4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */