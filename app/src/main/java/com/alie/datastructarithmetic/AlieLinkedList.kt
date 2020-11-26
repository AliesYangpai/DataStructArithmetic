package com.alie.datastructarithmetic

import java.lang.NullPointerException

/**
 * 自定义双向列表（LinkList）
 * 包含以下信息：
 * 1.头结点
 * 2.尾部节点
 * 3.目标数据
 * 4.大小
 */
class AlieLinkedList<E> {

    // 头部节点
    var first: Node<E>? = null

    // 尾部节点
    var last: Node<E>? = null

    // 容量
    var size: Int = 0


    /**
     * 添加数据
     */
    fun add(e: E) {
        addLinkLast(e)
    }

    fun get(index: Int): E? {
        if (index < 0 || index >= size) {
            return null
        }
        return getNodeItem(index)
    }

     fun getNodeItem(index: Int): E? {
        var node = first
         for (i in 0 until index) {
             node = node!!.next
         }
         return node!!.item
    }

    /**
     * 尾部添加数据
     */
    private fun addLinkLast(e: E) {
        val l = last
        val newNode = Node(l, e, null)
        last = newNode
        if (l == null) {
            first = newNode
        } else {
            l.next = newNode // 让last的尾部的指针指向newNode
        }
        size++
    }


    inner class Node<E>(
        var prev: Node<E>? = null,
        var item: E? = null,
        var next: Node<E>? = null
    ) {


    }
}