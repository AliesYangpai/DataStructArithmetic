package com.alie.liblinkedlist

fun main(array: Array<String>) {

    test001()
//    test002()
}

fun test001() {
    var linkedList = AlieLinkedList<String>()
    linkedList.add("My ")
    linkedList.add("name ")
    linkedList.add("is ")
    linkedList.add("Alie")


    val get = linkedList.get(3)
    println("====get:$get")
}

