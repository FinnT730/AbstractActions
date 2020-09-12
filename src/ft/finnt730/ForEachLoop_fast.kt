package ft.finnt730

import java.util.function.Consumer

class ForEachLoop_fast(array: Array<Any?>, action: Consumer<Any?>) {
    init {
        for (it in array) {
            action.accept(it);
        }
    }
}