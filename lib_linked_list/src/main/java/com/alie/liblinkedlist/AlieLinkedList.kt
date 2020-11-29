package com.alie.liblinkedlist

/**
 * 双向链表(非循环)
 * 1.当元素为的时候当双向链表中只有一个元素的时候，则first = last = newNode
 */
class AlieLinkedList<E> {
    var first: Node<E>? = null
    var last: Node<E>? = null
    var size: Int = 0


    /**
     * 添加元素
     */
    fun add(e: E) {
        addLastElement(e)
    }

    /**
     * 在尾部添加
     * 注意 这里的
     */
    fun addLastElement(e: E) {
        val l = last
        val newNode = Node(l, e, null)
        if (l == null) {
            last = newNode
            first = newNode
        } else {
            last = newNode
            l.next = newNode
        }
        size++
    }

    // 获取指定的链表中的元素
    fun get(index: Int): E? {
        if (index < 0 || index > size - 1) {
            return null
        }
        if (first == null || last == null) {
            return null
        }
        var x = first
        for (i in 0 until index) {
            x = x?.next
        }
        return x?.e
    }


}