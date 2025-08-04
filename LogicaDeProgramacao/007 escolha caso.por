programa {
  funcao inicio() {
   // declaração de variáveis 
   inteiro opcao
   real x , y, result

   //entrada de dados
   escreva("informe o valor de x ")
   leia(x)
   escreva("Informe o valor de y ")
   leia(y)
   escreva("1 - Soma.\n ")
   escreva("2 - Subtração.\n ")
   escreva("3 - Multiplicação.\n ")
   escreva("4 - Divisão\n. ")
   escreva(" Informe a opçaão desejada:")
   leia(opcao)

   //escolha caso
   escolha(opcao)
   {
    caso 1:
      result = x+y
      escreva(" O Resultado é", result)
      pare
    caso 2:
     result = x-y
     escreva(" O Resultado é ", result)
     pare
    caso 03:
     result = x*y
     escreva(" O Resultado é ", result)
     caso 04:
      result = x/y
     escreva(" O Resultado é ", result)
     pare
    caso contrario:
    escreva("Opção Invalida")
   }
  }
}
