// criar um programa que verifica se o usuario possui ou não carteira de habilitação

fun main(){

    val idade = 25
    val possuiCarta = true

    //verificar se ela é maior de idade e possui cnh

    if (idade >=18 && possuiCarta) { // "&&" = E
        println("Voce pode dirigir legalmente")
    } else {
        println("Voce nao pode dirigir")
    }

    val temingresso = false
    val estaComCamisaTime = true
    
    if (temingresso || estaComCamisaTime){ // "||" = OU
        println("entra fi esquece")
    } else{
        println("sai fora")
    }

}