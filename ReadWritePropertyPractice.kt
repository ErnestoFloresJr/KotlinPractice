import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main(){
    val obj = ReadWritePropertyPractice
    println(obj.message)
    obj.message = "New Value"
    println(obj.message)
}
object ReadWritePropertyPractice: ReadWriteProperty<Any, String> {
    var message: String = "Default Value"
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return message
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        message = value
    }
}