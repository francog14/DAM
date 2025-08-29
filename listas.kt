fun main () {

    println("-----LISTA-----")
    var lista = mutableListOf(1, 2, 5) //ahora es mutable
    lista.add(5)
    lista.add(8)
    lista.add(9)
    lista.add(12)
    lista.add(14)
    println("lista: $lista")

    for (i in lista){
        println("el elemento de la lista es: $i")
    }

    var filtrado = lista.filter { it % 2 ==0 } // le da condiciones a las listas
    println("filtrado: $filtrado")

    var doble = lista.map { it +1 } // busca el sucesor o con el - el antecesor
    println("doble: $doble")

    var sumatoria = lista.sum() // suma todo lo elementos
    println("sumatoria: $sumatoria")

    var buscaElpar = lista.find { it % 2 == 0 } //busca el primer elemnto que cumpla la condicion
    println("busca el par: $buscaElpar")

    var primerElemento = lista.first()
    println("el primer elemento: $primerElemento")

    var ultimoElemento = lista.last()
    println("el ultimo elemento: $ultimoElemento")

    println()
    println("----SET-----")

    var conjunto = setOf(1, 2, 5)
    println("conjunto: $conjunto")

    println()
    println("-----MAP-----")

    var mapa = mapOf("nombre" to "juan", "edad" to 9, "dolares" to 1000)
    println("mapa: $mapa")

    var informacion = mapOf("nombre" to "fernanda", "edad" to 28)
    informacion.forEach{
            (llave, valor) -> println("la llave es $llave y el valor es $valor")
    }

}