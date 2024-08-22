// Exercicio - maior ou menor de idade

fun main() {
    print("digite sua idade")
    val idadeInput: Int = readLine()

    if(idadeInput == null) {
        println("Entrada inválida")
        return
    }

    val idade = idadeInput.toIntOrNull()

    if(idade == null) {
        println("idade inválida. Por favor, insira um número válido")
    }

    if (idade >= 18) {
        println("voce e maior de idade")
    }else{
        println("voce e menor de idade")
    }

}