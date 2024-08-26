//Inversão de array

fun main(){

    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val reversedArray = originalArray.reversedArray() //array invertido

    println("Array original: ${originalArray.joinToString()}")

    println("Array invertido: ${reversedArray.joinToString()}")

}