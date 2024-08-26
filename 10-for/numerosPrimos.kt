fun main() {
    println("Digite um número: ")
    val input = readLine()

    val num = input?.toIntOrNull()

    if (num == null || num <= 1) {
        println("Número inválido. Por favor, digite um número inteiro maior que 1.")
        return
    }

    var isPrime = true

    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$num é um número primo")
    } else {
        println("$num não é um número primo")
    }
}