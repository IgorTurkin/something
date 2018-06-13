import java.util.*
fun main(args:Array<String>): Unit {
    var array2 = Array<Array<Int>>(3){
        i->arrayOf(i,i+1,i+2)
    }
    for(array in array2){
        for(mem in array){
            print(" $mem ")
        }
        println("")
    }
    var demo="Demo 1 2 3 4"
    print(demo.toLowerCase())
}