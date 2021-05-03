programa
{
	
	funcao inicio()
	{
		real p, E, multa
		
		escreva("Digite o peso dos tomates: ")
		leia(p)
		
		se(p > 50){
			E = (p-50)
		}senao{
			E = 0.0
		}
		multa = E*4
		
		escreva("O valor da multa é: ", multa , "\nPeso excedente: ", E)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */