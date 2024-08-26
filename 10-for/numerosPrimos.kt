fun main() {
    println("Escreva um numero: ")
    val num = readLine()

    val numInt = num.toIntOrNull()

    if (numInt == null || numInt <= 0) {
        println("Número inválido")
        return
    }

    var isPrime = true

    for (i in 2 until numInt) {
        if (numInt % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$numInt é um número primo")
    } else {
        println("$numInt não é um número primo")
    }
}