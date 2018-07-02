package tpkg

import org.junit.Test
import spkg.commonFun
import kotlin.test.assertEquals

actual class MPPCaller {
    @Test
    actual fun callEverybody() {
        val a = 42
        assertEquals(42, a)
    }
}


class CallingInternalsJVM {
    val a = 42

    @Test
    fun caller() {
        val a = 42
        assertEquals(42, a)
    }
}