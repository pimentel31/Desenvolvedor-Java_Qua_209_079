programa {
  funcao inicio() {
    // declaração de vetor
    cadeia nomes[10]
    inteiro idade[10]


    //entrada de dados
    para (inteiro i = 0; i < 10; i++)
    {
      escreva(" informe o ", i+1, "º nome do usuario: ")
      leia(nomes[i])
      escreva(" informe a idade do ", i+1, "° usuario: ")
      leia(idade[i])
    }


    //saida de dados
    para (inteiro i = 0; i < 10; i++)
    {
      escreva(" nome do", i+1, "° usuario: ", nomes[i], ".\n")
      escreva(" idade: ", idade[i], "\n\n")
    }
  }  
}
