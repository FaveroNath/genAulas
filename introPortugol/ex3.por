programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real n1, n2, n3, n4, quad1, quad2, quad3, quad4
		
		escreva("Digite o primeiro número: ")
		leia(n1)

			
		escreva("Digite o segundo número: ")
		leia(n2)

			
		escreva("Digite o terceiro número: ")
		leia(n3)

			
		escreva("Digite o quarto número: ")
		leia(n4)

		quad1 = mat.potencia(n1, 2.0)
		quad2 = mat.potencia(n2, 2.0)
		quad3 = mat.potencia(n3, 2.0)
		quad4 = mat.potencia(n4, 2.0)

		se(quad3 >= 1000){
			escreva("O quadrado do terceiro número é: ", quad3, "\n")
		}senao{
			escreva("O quadrado do primeiro número é: ", quad1, "\n")
			escreva("O quadrado do segundo número é: ", quad2, "\n")
			escreva("O quadrado do terceiro número é: ", quad3, "\n")
			escreva("O quadrado do quarto número é: ", quad4, "\n")	
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */