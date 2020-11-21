package com.alie.datastructarithmetic

import com.alie.datastructarithmetic.bean.Mahjong
import java.util.*

/**
 * 线性结构的测试类
 */
fun main(array: Array<String>) {
//    testBubbleSort01()
//    testSelectSort02()

    testReOrderPokerCars();
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
    for (j in 0 until array.size - 1) {
        var index = j
        for (i in j + 1 until array.size) {
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

/**
 * 麻将按照花色和点数排序
 * 先按照点数排序，组成链表数组
 * 再按照花色组成链表数组。
 * （链表基数排序）
 */
fun testReOrderPokerCars() {
    val listOfMahjong = ConstData.getListOfMahjong()
    val pointFilterArray = arrayOfNulls<LinkedList<Mahjong>>(9)
    for (index in pointFilterArray.indices) {
        pointFilterArray[index] = LinkedList<Mahjong>()
    }

    // 按照点数第一次排序(与其说排序，不如说是放在数组的指定位置)
    while (listOfMahjong.size > 0) {
        val removeFirst = listOfMahjong.removeFirst()
        pointFilterArray[removeFirst.point - 1]?.add(removeFirst)
    }
    for (index in pointFilterArray.indices) {
        listOfMahjong.addAll(pointFilterArray[index]!!) // 注意 这里是使用链表将 按照点数排序好的链表链接起来
    }


    val suitFilterArray = arrayOfNulls<LinkedList<Mahjong>>(3)
    for (index in suitFilterArray.indices) {
        suitFilterArray[index] = LinkedList<Mahjong>()
    }

    // 按照花色第二次排序(与其说排序，不如说是放在数组的指定位置)
    while (listOfMahjong.size > 0) {
        val removeFirst = listOfMahjong.removeFirst()
        suitFilterArray[removeFirst.suit - 1]?.add(removeFirst)
    }
    for (index in suitFilterArray.indices) {
        listOfMahjong.addAll(suitFilterArray[index]!!)
    }

    listOfMahjong.forEach {
        println("==== 点数 ${it.point} 花色：${it.suit}")
    }


}


