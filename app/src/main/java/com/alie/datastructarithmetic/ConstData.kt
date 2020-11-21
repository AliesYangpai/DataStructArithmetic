package com.alie.datastructarithmetic

import com.alie.datastructarithmetic.bean.Mahjong
import java.util.*

object ConstData {
    fun getArrayOfRandomOrder(): MutableList<Int> = mutableListOf(9, 2, 5, 8, 4, 6, 7, 1, 3, 0)
//    fun getArrayOfRandomOrder(): MutableList<Int> = mutableListOf(0, 1, 2, 8, 4, 6, 7, 5, 3,9)

    /**
     * 获取13张牌
     */
    fun getListOfMahjong(): LinkedList<Mahjong> {
        return LinkedList<Mahjong>(
            mutableListOf(
                Mahjong(1, 1),
                Mahjong(2, 1),
                Mahjong(5, 2),
                Mahjong(8, 3),
                Mahjong(7, 3),
                Mahjong(9, 2),
                Mahjong(2, 2),
                Mahjong(3, 2),
                Mahjong(6, 1),
                Mahjong(5, 1),
                Mahjong(3, 1),
                Mahjong(4, 3),
                Mahjong(6, 3),
            )
        )
    }
}