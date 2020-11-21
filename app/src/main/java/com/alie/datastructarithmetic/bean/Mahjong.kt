package com.alie.datastructarithmetic.bean


/**
 * point 点数 [1,9]
 * suit 花色 [筒子(1)，万(2)，条(3)] 此处以 1,2,3替代
 * 其实为了进一步优化，可将 point与 suit 更改为 Byte类型
 */
data class Mahjong(var point: Short, var suit:Short)