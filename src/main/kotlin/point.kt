import kotlin.math.sqrt
import kotlin.math.pow
class Point(acor:Double,bcor:Double) {
    var Acor=acor
    var Bcor=bcor

    override fun toString(): String {
        return "$1cor= $Acor 2cor= $Bcor"
    }

    override fun equals(other: Any?): Boolean {
        return other is Point && Acor==other.Acor&&Bcor==other.Bcor
    }
    fun simetriuladGadatana():Point{
        return Point(-1*Acor,-1*Bcor)

    }
     fun distance(cord:Point):Double{
        return  sqrt((cord.Acor - Acor).pow(2) + (cord.Bcor - Bcor).pow(2))
    }
}