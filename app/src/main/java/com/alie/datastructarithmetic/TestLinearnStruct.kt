package com.alie.datastructarithmetic

/**
 * 线性结构的测试类
 */
fun main(array: Array<String>) {
//    testBubbleSort01()
    testSelectSort02()
}

/**
 * 冒泡 适合样本数量在 10个左右
 * 从小到大排列
 */
fun testBubbleSort01() {
    val array = ConstData.getArrayOfRandomOrder()
    for (j in 1 until array.size) {
        var flag = true
        for (i in 0 until array.size - j) {
            if (array[i] > array[i + 1]) {
                val temp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = temp
                flag = false
            }
        }
        if (flag) break
        println("====testBubble01  single: $array   round:$j")
    }
    println("====testBubble01 all : $array")
}

/**
 * 选择排序 适合样本数量在 10个左右
 * 首元素定位，确定最大或者最小的元素
 */
fun testSelectSort02() {
    val array = ConstData.getArrayOfRandomOrder()
    for( j in 0 until array.size -1) {
        var index = j
        for (i in j+1 until array.size) {
            if (array[i] < array[index]) {
                index = i
            }
        }
        var temp = array[j]
        array[j] = array[index]
        array[index] = temp
        println("====testSelectSort02 array :$array")
    }
    println("====testSelectSort02  finish array :$array")

//    var index = 0
//    for (i in 1 until array.size) {
//        if (array[i] < array[0]) {
//            index = i
//        }
//    }
//    var temp = array[0]
//    array[0] = array[index]
//    array[index] = temp
//    println("====testSelectSort02 array :$array")
}

