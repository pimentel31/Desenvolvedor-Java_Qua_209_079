programa {
  funcao inicio() {
    //Armazenar variáveis

    cadeia nome
    inteiro idade
    cadeia genero

    //entrada de dados
    escreva("Informe seu nome:")
    leia(nome)
    escreva("Informe sua idade:")
    leia(idade)
    escreva("Informe seu genero:")
    leia(genero)


    //saída de dados
    se(idade >= 62 e genero == "feminino")escreva(nome," você esta aposentada")
    se(idade >= 65 e genero == "masculino")escreva(nome," você esta aposentado")
    senao
    {
      escreva("você não pode se aposentar")
    }
  }
}
