programa {
  funcao inicio() {
    // declarçao de variaveis
    cadeia nome 
    real nota

    //entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe sua nota: ")
    leia(nota)


    //verificar se a nota é válida
    se(nota >= 0 e nota <= 10)
    {
      se(nota >= 7)escreva(nome, " está aprovado.")
      senao se (nota >= 5)escreva(nome," está de recuperação.")
      senao escreva(nome," está reprovado.")
    }
    senao
    {
      escreva("Nota inválida.")
    }
  }
}
