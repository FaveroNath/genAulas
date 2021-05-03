programa
{
	
	funcao inicio()
	{
		real ind
		
		escreva("Digite o índice de poluição emitido: ")
		leia(ind)
		
		se(0.05 <= ind e ind <= 0.25){
			escreva("Ídice de poluição adequado ")
		}senao se(ind > 0.25 e ind <= 0.3){
			escreva("Empresas do grupo 1 devem supender suas atividades")
		}senao se(ind > 0.3 e ind <= 0.4){
			escreva("Empresas do grupo 1 e 2 devem supender suas atividades")
		}senao{
			escreva("Empresas do grupo 1, 2 e 3 devem supender suas atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 142; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */