programa {
  funcao inicio() {
    //declaraçao de variaveis
    cadeia nome 
    inteiro idade 
    cadeia genero

    //entrada de dados 
    escreva("informe seu nome: ")
    leia(nome)
    escreva("informe seu genereo: ")
    leia(genero)
    escreva("informe sua idade")
    leia(idade)


    //saida de dados
    se(idade >= 62 e genero =="mulher"){
      escreva("Parabens voce pode se apozentar ")
      se(idade >=65 e generto =="Masculino")escreva("Parabens voce pode apozentar")
      }
    senao
    {
      escreva("Voce nao esta aptor")
    }
    
   
    
  }
}
