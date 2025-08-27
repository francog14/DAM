fun main(){
/*  EJEMPLO SICLO FOR
    for (i in 1..10)
        println("vamos en el valor $i")
*/
/* EJEMPLO SICLO WHILE
    var i = 1;
    do {
        println(i)
        i++
    } while(i <= 10)
*/

    var i = 1
    var ciclos = 1
    do {
        ciclos++
        val randomNumber = (0..10).random()
        i = i + randomNumber
        println("ciclo $ciclos : $i")
    } while ( i <= 300)


}

























