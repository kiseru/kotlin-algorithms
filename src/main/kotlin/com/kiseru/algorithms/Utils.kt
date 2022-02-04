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

    fun selectionSort(array: Array<Int>) {
        for (i in array.indices) {
            var smallestIndex = i
            for (j in i + 1 until array.size) {
                smallestIndex = minIndex(array, smallestIndex, j)
            }
            swap(array, i, smallestIndex)
        }
    }

    private fun minIndex(array: Array<Int>, i: Int, j: Int): Int = if (array[i] < array[j]) i else j

    private fun swap(array: Array<Int>, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}