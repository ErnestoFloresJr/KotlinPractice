fun main(){
    val obj = PropertyDelegationClass(YourDataClass())
    println("Property1: ${obj.prop1}")
    println("Property2: ${obj.prop2}")
    println("Property2: ${obj.prop3}")
    println("Property2: ${obj.prop4}")
    println("Property2: ${obj.prop5}")
    println("Property2: ${obj.prop6}")
}
var topLevelVar1 = "Rimuru Tempest"
var topLevelVar2 = "Slime"

class PropertyDelegationClass(obj1: YourDataClass, private var hero: String = "Bell Cranel",
                              private var theType: String = "Human Argonaut") {
    var prop1: String by obj1::heroName
    var prop2: String by obj1::heroType
    var prop3: String by ::topLevelVar1
    var prop4: String by ::topLevelVar2
    var prop5: String by this::hero
    var prop6: String by this::theType
}

data class YourDataClass(
    var heroName: String = "Veldora Tempest",
    var heroType: String = "Dragon"
)