fun main (){
    validacionesEdad(21)
    validacionesEdad(14)
    validacionesEdad(11)
    validacionesEdad(60)

}

fun validacionesEdad( edad: Int){
    println("La edad es de $edad")
    if ( edad >= 18 ){
        println("Es mayor de edad")
    }
    else {
        println("es menor de edad")
    }
}



































