fun main (){
    println("iNICIO DEL PROGRAMA")

    val a = 5
    val b = 3

    sumar(a,b)
    sumar(9, 6)
    sumar(4, 7)
    sumar(93, 1)

    resta(a,b)
    resta(9, 6)
    resta(4, 7)
    resta(93, 1)

    val x = 5
    val y = 3

    multi(x,y)
    multi(9, 6)
    multi(4, 0)
    multi(93, 1)

    dividir(x,y)
    dividir(9, 6)
    dividir(4, 0)
    dividir(93, 1)
}

fun sumar(a:Int, b:Int){
    print("programa de sumas extremas - voy a sumar $a con $b = ")
    println(a+b)
}

fun resta(a: Int, b: Int){
    print("programa de restas extremas - voy a restar $a con $b = ")
    println(a-b)
}

fun multi(x: Int, y: Int){
    print("programa de multiplicanciones extremas - voy a multiplicar $x con $y = ")
    println(x*y)
}


fun dividir(x: Int, y: Int) {

    if (y != 0) {
        print("programa de division extremas - voy a dividir $x con $y = ")
        println(x / y)
    } else {
        println("Error: División por cero")
    }
}

