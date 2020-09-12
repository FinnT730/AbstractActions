package ft.finnt730

import groovy.lang.Closure
import org.codehaus.groovy.runtime.DefaultGroovyMethods
import java.util.function.Consumer
import kotlin.jvm.internal.Intrinsics

class ForEachLoop_slow(array: Array<Any>?, action: Consumer<Any?>) {
    init {
        DefaultGroovyMethods.each(
            DefaultGroovyMethods.iterator(array),
            object : Closure<Any?>(this, this) {
                fun doCall(it: Any?) {
                    action.accept(it)
                }

            })
    }
}