programa {
  funcao inicio() {
    //declaração de variáveis
    cadeia nome,genero
    inteiro idade

    //entrada de dados
    escreva("Informe o nome:")
    leia(nome)
    escreva("Informe sua idade:")
    leia(idade)
    escreva("informe seu gênero:")
    leia(genero)

    se(idade >= 65 e genero == "masculino" ou idade >= 62 e genero == "feminino")escreva(nome, " aposentadoria autorizada.")
    senao escreva(nome, " aposentadoria não autorizada.")
  }
}
