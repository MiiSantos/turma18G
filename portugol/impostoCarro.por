programa
{
	
	funcao inicio()
	{
		real carroNovo, valorFabrica, impostos

		escreva("Qual o valor pago pelo carro?")
		leia(carroNovo)

		impostos = carroNovo*0.78
		valorFabrica = carroNovo - impostos

		escreva("O valor do carro à preço de fábrica é ",valorFabrica)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */