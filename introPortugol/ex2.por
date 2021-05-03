programa
{
	
	funcao inicio()
	{
		real c, n, sH, s , E
		escreva("Digite o código: ")
		leia(c)
		escreva("Digite horas trabalhadas: ")
		leia(n)

		se(n > 50){
			E = n-50
			s = E*20.0
			sH = 50.0*10.0
			
		}senao{
			E = 0.0
			sH = 10*n
			s = 0.0
		}
		
		
		
		
		escreva("Salário total: ", sH, "\nSalário excendente: ", s)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */