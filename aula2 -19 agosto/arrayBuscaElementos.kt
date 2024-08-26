fun  main() {

    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie" //Elemento a ser buscado
    var found = false //variavel para verificar se o elemento foi achado

    //loop para verificar se o elemento está presente
    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }

    }   

    if(found) {
        println("O nome $searchName foi encontrado!")
    } else {
        println("O nome $searchName não foi encontrado!")
    }

}