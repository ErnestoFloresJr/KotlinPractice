fun main(){
    val obj = PropertyDelegationUsingMap(mutableMapOf("prop1" to "Rimuru Tempest", "prop2" to "Slime"))
    println("Property1: ${obj.prop1}")
    println("Property2: ${obj.prop2}")
    obj.prop1 = "Veldora Tempest"
    obj.prop2 = "Dragon"
    println("Property1: ${obj.prop1}")
    println("Property2: ${obj.prop2}")
}
class PropertyDelegationUsingMap(private var map: MutableMap<String, String>) {
    var prop1: String by map
    var prop2: String by map
}