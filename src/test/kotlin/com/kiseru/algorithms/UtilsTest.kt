package com.kiseru.algorithms

import org.junit.jupiter.api.Assertions.*
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

    @DisplayName("test selectionSort")
    @Test
    fun selectionSort() {
        val array = arrayOf(5, 3, 6, 2, 10)
        Utils.selectionSort(array)
        assertArrayEquals(arrayOf(2, 3, 5, 6, 10), array)
    }
}