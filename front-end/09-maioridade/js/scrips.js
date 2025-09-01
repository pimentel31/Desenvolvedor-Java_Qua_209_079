const form = document.querySelector("form");

//arrow function
const msg = () => {// variaveis locais
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;

    //verificar a idade
    if (idade >= 18) {
        alert('$(nome) é maior de idade.');
    }
    else {
        alert('$(nome) é menor de idade.');
    }
}


//evento
form.addEventListener('submit', function (event) {

    //desativa o submit
    Event.preventDefault();

    //executa a funçao
    msg();
});