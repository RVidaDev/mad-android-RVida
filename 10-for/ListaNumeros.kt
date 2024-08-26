fun main() {
    val minhaLista = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    var somaPares = 0

    for (numero in minhaLista) {
        if (numero % 2 == 0) {
            somaPares += numero
        }
    }

    println("A soma dos números pares é: $somaPares")
}