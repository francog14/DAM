//DESARROLLO ORIENTADO A OBJETOS

fun main (){
    val charmander = Pokemon("CHARMANDER", 40, 80)
    val mewtwo = Pokemon ("MEWTWO", 300, 450)
    charmander.informacion()
    mewtwo.informacion()

    charmander.sePraparaParaLaBatalla()
    mewtwo.recibedano(charmander.atk)

    mewtwo.sePraparaParaLaBatalla()
    charmander.recibedano(mewtwo.atk)
}

class Pokemon (
    val nombre: String,
    var atk: Int,
    var hp: Int
){
    fun sePraparaParaLaBatalla(){
        println("el $nombre se prepara para la battla")
    }
    fun informacion(){
        println("$nombre - ATK:$atk  HP:$hp")
    }
    fun recibedano(dano: Int){
        println("$nombre recibe $dano puntos de daño")
        hp = hp - dano
        println("Ahora le queda $hp puntos")
        if (hp<0){
            println("$nombre SE HA DEBILITADO !!!")
        }
    }
}