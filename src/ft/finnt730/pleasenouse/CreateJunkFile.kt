package ft.finnt730.pleasenouse

import ft.finnt730.ForLoop_fast
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.function.Consumer


/***
 * This was added as an joke!
 * If you see use in this, use it, but.... please don't XD
 * (this whole package should not be used, tbf)
 */

@Deprecated("Please don't use this, it was added because of an joke.")
class CreateJunkFile {
    init {
        val x = FileWriter(File("JunkFile.txt"))
        Consumer { it: Any ->
            try {
                x.write(it as Int)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }?.let { it1 -> ForLoop_fast(0, 100000, 1, it1) }
        x.flush()
        x.close()
    }
}