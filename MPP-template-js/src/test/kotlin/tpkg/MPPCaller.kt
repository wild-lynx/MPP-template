package tpkg

import spkg.commonFun
import kotlin.test.Test
import kotlin.test.assertEquals

actual class MPPCaller {
    @Test
    actual fun callEverybody() {
        val a = commonFun()
        assertEquals(42, a)
    }
}

class CallingCommonJS {
    val a = 42

    @Test
    fun caller() {
        val a = commonFun()
        assertEquals(42, a)
    }
}