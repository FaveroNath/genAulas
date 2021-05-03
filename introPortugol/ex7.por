programa
{
	inclua biblioteca Matematica--> mat
	funcao inicio()
	{
		real b, h, area
		
		escreva("Digite a base do triângulo: ")
		leia(b)
		
		escreva("Digite a altura do triângulo: ")
		leia(h)

		se(b > 0 e h > 0){
			area = (b*h)/2
			escreva("A área do triângilo é: ", mat.arredondar(area, 2))	
		}senao{
			escreva("Valores inválidos!!")
		}
	}
	//Nathalia Favero AMorim Turma: 22
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */