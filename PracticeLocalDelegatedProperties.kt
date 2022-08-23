fun main(){
    val obj = PracticeLocalDelegatedProperties(10.0, 10.0)
    obj.doSomething("any"){obj.calculateThePerimeter()}
    obj.doSomething("area") { obj.calculateTheArea() }
    obj.doSomething("perimeter"){obj.calculateThePerimeter()}
}

class PracticeLocalDelegatedProperties(private val length: Double, private val width: Double) {
    fun doSomething(calculateMessage: String, here: () -> Double){
        val local1: Double by lazy(here)
        when(calculateMessage){
            "area" -> println("Area: $local1")
            "perimeter" -> println("Perimeter: $local1")
            else -> println("Choose \'area\' or \'perimeter\' only")
        }
    }
    fun calculateTheArea(): Double{
        return length * width
    }
    fun calculateThePerimeter(): Double{
        return 2.0 * (length + width)
    }
}