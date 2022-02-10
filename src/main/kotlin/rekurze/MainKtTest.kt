package rekurze

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun add() {
        assertEquals(5, add(5))
    }

    @Test
    fun basicTimes() {
        assertEquals(15, basicMultiply(5,3))
    }

    @Test
    fun powerTest(){
        assertEquals(125, power(5,3))
    }

    @Test
    fun sumNumsTest(){
        assertTrue("253" == sumNums("2","53"))
    }

    @Test
    fun palindromeTest(){
        assertTrue("UwU" == palindrome("UwU"))
    }
}