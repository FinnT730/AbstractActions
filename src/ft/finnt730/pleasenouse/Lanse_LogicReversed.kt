package ft.finnt730.pleasenouse


/***
 * This was added as an joke!
 * If you see use in this, use it, but.... please don't XD
 * (this whole package should not be used, tbf)
 */

@Deprecated("Please don't use this, it was added because of an joke.")
class Lanse_LogicReversed(x: Byte) {

    var result: Byte = 0

    init {
        var x = x
        x = if (x >= 1) {
            0
        } else {
            1
        }
        result = x
    }
}