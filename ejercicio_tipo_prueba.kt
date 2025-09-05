open class Mascota (
    val nombre: String,
    val edad: Int
){
    open fun mostratInfo(){
        println("nombre: $nombre | edad: $edad")
    }
}
class Gato(var pelaje: String, nombre: String, edad: Int): Mascota(nombre,edad){
    override fun mostratInfo(){
        println("pelaje: $pelaje | nombre: $nombre | edad: $edad")
    }
}

class Pez(var sangre: Boolean, nombre: String, edad: Int): Mascota(nombre, edad){
    override fun mostratInfo(){
        var estadoSangre = ""
        if (sangre==true) {
            estadoSangre = "es de sangre fria "
        }
        else {
            estadoSangre = "tiene la sangre caliente"
        }
        println("sangreFria: $sangre | nombre: $nombre | edad: $edad $estadoSangre")


    }
}
fun main(){
    var pedrito = Gato("rubio", "pedrito", 2)
    pedrito.mostratInfo()

    var wolverine = Pez(true, "wolverine", 10)
    wolverine.mostratInfo()
}