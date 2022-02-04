package com.kiseru.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Test Utils")
class UtilsTest {

    @DisplayName("test binarySearch")
    @Test
    fun binarySearch() {
        val array = arrayOf(1, 3, 5, 7, 9)

        assertEquals(1, Utils.binarySearch(array, 3))
        assertThrows(IllegalArgumentException::class.java) { Utils.binarySearch(array, -1) }
    }
}