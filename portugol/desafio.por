programa
{
	/* pegar nome de 4 alunos
	* 4 materias, port, mat, ciencias, artes
	* nota ate 5 precisa estudar, acima continuar
	 */
	funcao inicio()
	{
		cadeia nome1, nome2, nome3, nome4
		inteiro i, x, notas, media=0, soma=0

		
		para(x=0; x<4; x++){
			para(i=0; i<=3; i++) {

			escreva("Informe nome do aluno: ")
			leia(nome1)
			escreva("Escreva a nota de matemática: ")
			leia(notas)
			escreva("Escreva a nota de Portugues: ")
			leia(notas)
			escreva("Escreva a nota de Ciências ")
			leia(notas)
			escreva("Escreva a nota de artes: ")
			leia(notas)

			soma=soma+notas
			media=soma/4

			escreva(notas,"\n")
		}
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */