package tpkg

import spkg.SimpleObj
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

actual class MPPCaller {
    @Test
    actual fun callEverybody() {
        val abc = CallingCommonFun().a
        println("=== Success! ====")
        println("$abc")
    }
}

class FooJUnitTest {
    @Test
    fun testBar() {
        Assert.assertTrue(true)
    }

    @Test
    fun testCommon() {
        val x = SimpleObj
        val i = x.getSomeStr()
        assertEquals("Hello from common module", i)
    }
}
