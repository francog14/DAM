// =============================================================================
// EJEMPLO: Crear un sistema de Pokemones en Kotlin con herencia y polimorfismo
// =============================================================================

// Pokemon se convierte en un objeto padre ( con open )
// que puede heredar propiedades y métodos a sus hijos
open class Pokemon(
    val nombre: String,
    var hp: Int,
    var atk: Int,
    var estado: String = "normal" // estado puede ser normal|envenenado|congelado|quemado
){

    fun info(){
        println("ℹ️ $nombre | HP:$hp ATK:$atk | Estado: $estado")
    }

    fun recibeDano(dano: Int) {
        println("$nombre recibe $dano de daño")
        hp -= dano
        if (hp < 0){
            hp = 0
            println("$nombre ha sido derrotado")
        }
    }

    // algunos ataques cambian el estado del pokemon, para eso es este método
    fun cambiarEstado(nuevoEstado: String) {
        estado = nuevoEstado
        println("$nombre ahora está $nuevoEstado")
    }

    fun estaVivo(): Boolean {
        return hp > 0
    }
}

// Tipo Fuego es un objeto que hereda propiedades de "Pokemon"
// esto es porque un pokemon de tipo fuego es un pokemon
class TipoFuego(nombre: String, hp: Int, atk: Int): Pokemon(nombre, hp, atk){
    fun aumentarAtaque(){
        atk += 20
        println("⚔️ $nombre aumenta su ataque en 20! Ataque actual: $atk")
    }

    fun lanzallamas(pokemonAlQueAtaca: Pokemon){
        println("🔥 $nombre usa Lanzallamas contra ${pokemonAlQueAtaca.nombre}!")
        pokemonAlQueAtaca.recibeDano(atk)
    }

    fun quemar(pokemonAlQueAtaca: Pokemon){
        println("🔥 $nombre intenta quemar a ${pokemonAlQueAtaca.nombre}")
        pokemonAlQueAtaca.cambiarEstado("quemado")
    }
}

// Tipo Agua es un objeto que hereda propiedades de "Pokemon"
// esto es porque un pokemon de tipo agua es un pokemon
class TipoAgua(nombre: String, hp: Int, atk: Int): Pokemon(nombre, hp, atk){
    fun lanzaAgua(pokemonAlQueAtaca: Pokemon){
        println("💧 $nombre usa Lanza Agua contra ${pokemonAlQueAtaca.nombre}!")
        pokemonAlQueAtaca.recibeDano(atk)
    }

    fun curar(){
        val curacion = 50
        hp += curacion
        println("❤️ $nombre se cura y recupera $curacion HP! HP actual: $hp")
    }
}

// Tipo Veneno es un objeto que hereda propiedades de "Pokemon"
// esto es porque un pokemon de tipo veneno es un pokemon
class TipoVeneno(nombre: String, hp: Int, atk: Int): Pokemon(nombre, hp, atk){
    fun envenenar(pokemonAlQueAtaca: Pokemon){
        println("💀 $nombre envenena a ${pokemonAlQueAtaca.nombre}")
        pokemonAlQueAtaca.cambiarEstado("envenenado")
        pokemonAlQueAtaca.recibeDano(15) // el veneno causa daño inmediato
    }
}

// Tipo Hielo es un objeto que hereda propiedades de "Pokemon"
// esto es porque un pokemon de tipo hielo es un pokemon
class TipoHielo(nombre: String, hp: Int, atk: Int): Pokemon(nombre, hp, atk){
    fun congelar(pokemonAlQueAtaca: Pokemon){
        println("🥶 $nombre congela a ${pokemonAlQueAtaca.nombre}")
        pokemonAlQueAtaca.cambiarEstado("congelado")
    }

    fun rayoDeHielo(pokemonAlQueAtaca: Pokemon){
        println("❄️ $nombre usa Rayo de Hielo contra ${pokemonAlQueAtaca.nombre}!")
        pokemonAlQueAtaca.recibeDano(atk)
    }
}

fun main() {
    println("**************************")
    println("****** POKEMON GAME ******")
    println("**************************")

    // Instanciamos dos pokemones ( uno tipo fuego y otro tipo agua )
    val charmander = TipoFuego("Charmander", 100, 40) // este es un charmander con 100 de hp y 40 de atk
    val lapras = TipoAgua("Lapras", 180, 50) //este es un lapras con 180 de hp y 50 de atk

    println("\n--- ESTADO INICIAL ---")
    charmander.info()
    lapras.info()

    println("\n--- COMIENZA LA BATALLA ---")

    // Turno 1: Charmander ataca con lanzallamas a Lapras
    println("\nTurno 1:")
    charmander.lanzallamas(lapras)

    // Turno 2: Lapras se cura
    println("\nTurno 2:")
    lapras.curar()

    // Turno 3: Charmander aumenta su ataque y luego quema a Lapras
    println("\nTurno 3:")
    charmander.aumentarAtaque()
    charmander.quemar(lapras)

    // Turno 4: Lapras ataca con agua a Charmander
    println("\nTurno 4:")
    lapras.lanzaAgua(charmander)

    println("\n--- ESTADO FINAL ---")
    charmander.info()
    lapras.info()

    // Verificamos quién ganó, esto finalmente depende de los atk y hp instanciados
    println("\n--- RESULTADO ---")
    if (charmander.estaVivo() && lapras.estaVivo()) {
        println("¡Ambos pokemones siguen en pie!")
    } else if (charmander.estaVivo()) {
        println("¡${charmander.nombre} es el ganador!")
    } else if (lapras.estaVivo()) {
        println("¡${lapras.nombre} es el ganador!")
    } else {
        println("¡Es un empate! Ambos pokemones están derrotados.")
    }
}