package tpkg

import spkg.commonFun
import kotlin.test.Test
import kotlin.test.assertEquals

expect class MPPCaller {
    @Test
    fun callEverybody()
}


class CallingCommonFun {
    val a: Int
        get() = 42

    @Test
    fun caller() {
        val a = commonFun()
        assertEquals(42, a)
    }
}