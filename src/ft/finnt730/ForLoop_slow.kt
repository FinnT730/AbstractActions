package ft.finnt730

import groovy.lang.Closure
import org.codehaus.groovy.runtime.DefaultGroovyMethods
import java.util.function.Consumer

class ForLoop_slow(start: Int, end: Int, step: Int, action: Consumer<Any?>) {
    init {
//        if (end < 0) {
//            var i = end
//            while (i < start) {
//                DefaultGroovyMethods.each(i, object : Closure<Any?>(this, this) {
//                    fun doCall(it: Int? = null) {
//                        action.accept(it)
//                    }
//                })
//                i += step
//            }
//        } else {
            var i = start
            while (i < end) {
                DefaultGroovyMethods.each(i, object : Closure<Any?>(this, this) {
                    fun doCall(it: Int? = null) {
                        action.accept(it)
                    }
                })
                i += step
            }
//        }


//        for(int i = start; i < end; i += step) {
//            i.each {
//                action.accept(it)
//            }
//        }
    }
}