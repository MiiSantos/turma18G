programa
{
	//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
	//apresente no final o total do somatório, a média e o total de valores lidos. 
	//O programa deve fazer as leituras dos valores enquanto o usuário estiver 
	//fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário 
	//fornecer um valor negativo.

	funcao inicio()
	{
		inteiro num = 0, soma = 0, media

		enquanto (num % 2 == 0) {
		escreva("Olá, informe um número: ")
		leia(num)

		soma = soma + num
		media = soma/num
		limpa()

		escreva("A soma é igual a ", soma," e a media é igual a ",media)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */