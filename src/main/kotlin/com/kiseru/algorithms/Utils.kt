package com.kiseru.algorithms

object Utils {

    fun binarySearch(array: Array<Int>, item: Int): Int {
        var low = 0
        var high = array.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            val guess = array[mid]
            if (guess == item) {
                return mid
            }

            if (guess > item) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        throw IllegalArgumentException("There is no such item in array")
    }
}