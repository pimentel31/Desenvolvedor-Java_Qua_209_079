programa {
  funcao inicio() {
    // declaraçao de variaveis
    cadeia nome
    inteiro idade
    real altura


    // entrada de dados
    escreva("informe seu nome: ")
    leia(nome)
    escreva("informe sua idade: ")
    leia(idade)
    escreva("informe sua altura: ")
    leia(altura)

    // verificar a idade e a altura 
    se(idade >= 12 e altura>= 1.15)
    {
      escreva(nome, " está autorizado a entrar no trem fantasma.")
    }
    senao
    {
      escreva(nome, " não está autorizado a entrar no trem fantasma.")
    }

  }
}
