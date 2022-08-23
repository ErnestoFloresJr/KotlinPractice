import kotlin.reflect.KProperty

fun main(){
    val object1 = PropertyDelegatedRequirements()
    println("message: ${object1.message}")
    object1.message = "Hello Kotlin"
    println("message: ${object1.message}")
}
class PropertyDelegatedRequirements {
    var message: String by ClassRepresentative()
}
class ClassRepresentative{
    private var stringMessage = "Hello World"
    operator fun getValue(obj: PropertyDelegatedRequirements, property: KProperty<*>): String{
        return stringMessage
    }
    operator fun setValue(obj: PropertyDelegatedRequirements, property: KProperty<*>, value: String){
        stringMessage = value
    }
}