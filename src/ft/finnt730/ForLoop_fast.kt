package ft.finnt730

import java.util.function.Consumer

class ForLoop_fast(start: Int, end: Int, step: Int, action: Consumer<Any>) {
    init {
        var i = start
        while (i < end) {
            action.accept(i)
            i += step
        }
    }
}