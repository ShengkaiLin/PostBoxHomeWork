import java.util.*

fun main(args: Array<String>) {
    val sca = Scanner(System.`in`)

    println("Please enter object's length:")
    val length = sca.nextFloat()

    println("Please enter object's width:")
    val width = sca.nextFloat()

    println("Please enter object's height:")
    val height = sca.nextFloat()

   println("This is the box you need.");

    if(Box3().validate(length,width,height)){
        println("Box3");

    }else if(Box5().validate(length,width,height)){
        println("Box5");
    }


}

class Box5{
    val length = 39.5f
    val width = 27.5f
    val height = 23f

    fun validate(length : Float , width :Float , height : Float) :Boolean{
        return length<=this.length && width<=this.width && height<=this.height
    }
}

class Box3{
    val length = 23f
    val width = 14f
    val height = 13f

    fun validate(length : Float , width :Float , height : Float) :Boolean{
        return length<=this.length && width<=this.width && height<=this.height
    }
}