import kotlin.properties.Delegates

fun main(){
    val obj = LazyAndObservableFile()
    println(obj.message1)
    obj.property1 = "Waah"
}
class LazyAndObservableFile {
    val message1: String by lazy {
        getYourMessageHere("Slime", "Oink.. Oink...")
    }
    var property1: String by Delegates.observable("Veldora"){
        prop, old, new -> println("$old: $new")
    }

    private fun getYourMessageHere(name: String, text1: String): String {
        return "$name: $text1"
    }
}
