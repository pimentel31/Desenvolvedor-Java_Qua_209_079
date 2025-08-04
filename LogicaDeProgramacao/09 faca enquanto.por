programa {
  funcao inicio() {
    // declaração de variáveis 
    real x, y, result
    inteiro opcao

    //lop faca enquanto
    faca
    {
      
      // menu
      escreva("\n1 - Soma\n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação\n")
      escreva("4 - Divisão\n")
      escreva("5 - Sair do programa\n")
      escreva("Informe a opção desejada: ")
      leia(opcao)

      //verifica se o usuario deseja sair ou nao
      se(opcao >= 1 e opcao <= 4)
      {
        escreva("Informe o valor de x: ")
        leia(x)
        escreva("informe o valor de y: ")
        leia(y)
      }


    //verifica a opção escolhida
    escolha(opcao)
    {
      caso 1:
      result = x+y
      escreva("Resultado: ", result)
      pare
      caso 2:
      result = x-y
      escreva("Resultado: ", result)
      pare
      caso 3:
      result = x*y
      escreva("Resultado: ", result)
      pare
      caso 4:
      result = x/y
      escreva("Resultado: ", result)
      pare
      caso 5:
      escreva("Progama encerrado. ", result)
      pare
      caso contrario:
       escreva("opção invalida. ")
      
    }
    } enquanto(opcao != 5)
  }
}
