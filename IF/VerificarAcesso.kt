//crie um programa que verifica se o usuario tem acesso ao sistema ou não

fun main(){
    val usuarioCerto = "vinny"
    val senhaCerta = "123456"
    
    println("Digite o nome do usuário: ")
    val usuario = readLine()
    println("Digite a senha: ")
    val senha = readLine()


    if (usuario == usuarioCerto && senha == senhaCerta){

        println("BEM VIND@")

    } else{
        println("ce ta todo errado chara")
        return
    }

}