programa {
  funcao inicio() {
    // declaração de variaveis
    cadeia nome
    inteiro idade 


    //entrada de dados
    escreva("informe seu nome: ")
    leia(nome)
    escreva("informe sua idade: ")
    leia(idade)


    //esytutura de decisão
    se (idade >= 18)
    {
      escreva(nome,"é maior de idade.")
    }
    senao
    {
      escreva(nome, "é menor de idade.")
    }
  }
}
