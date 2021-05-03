programa
{
	
	funcao inicio()
	{
		inteiro idade
		
		escreva("Digite a idade: ")
		leia(idade)
		
		se(5 <= idade e idade <= 7){
			escreva("infantil A")
		}senao se(7 < idade e idade <= 11){
			escreva("infantil B")
		}senao se(11 < idade e idade <= 13){
			escreva("Juvenil A")
		}senao se(13 < idade e idade <= 17){
			escreva("Juvenil B")
		}senao se(17 < idade){
			escreva("Maiores de 18 anos, grupo adulto")
		}senao{
			escreva("idade não se enquadra nos grupos")	
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */