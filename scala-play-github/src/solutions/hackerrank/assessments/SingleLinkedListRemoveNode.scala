package solutions.hackerrank.assessments

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

import scala.util.control.Breaks._


class SinglyLinkedListNode(nodeData: Int) {
  val data = nodeData
  var next: SinglyLinkedListNode = null
}

class SinglyLinkedList(
                        var head: SinglyLinkedListNode = null,
                        var tail: SinglyLinkedListNode = null
                      ) {
  def insertNode(nodeData: Int): Unit = {
    val node = new SinglyLinkedListNode(nodeData)

    if (this.head == null) {
      this.head = node
    } else {
      this.tail.next = node
    }

    this.tail = node
  }
}

object SinglyLinkedListPrintHelper {
  def printList(head: SinglyLinkedListNode, sep: String, printWriter: PrintWriter): Unit = {
    var node = head

    while (node != null) {
      printWriter.print(node.data)

      node = node.next

      if (node != null) {
        printWriter.print(sep)
      }
    }
  }
}



/*
object Result {

  /*
   * Complete the 'removeNodes' function below.
   *
   * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
   * The function accepts following parameters:
   *  1. INTEGER_SINGLY_LINKED_LIST listHead
   *  2. INTEGER x
   */

  /*
   * For your reference:
   *
   * SinglyLinkedListNode {
   *     data: Int
   *     next: SinglyLinkedListNode
   * }
   *
   */

  def removeNodes(listHead: SinglyLinkedListNode, x: Int): SinglyLinkedListNode = {
    // Write your code here

    var head, temp = listHead
    var prev: SinglyLinkedListNode = null

    // when head itself is greater than input integer
    if (head != null && head.data > x) {
      head = temp.next

    }

    prev = head
    temp = head.next

    // As long data in node is less than or equal to input integer
    while (temp != null) {

      if ( temp.data > x) {
        prev.next = temp.next
        temp = prev
      }
      else
        temp = temp.next


//      if (temp.data > x){
//        prev.next = temp.next
//        temp = prev
//      }

    }

    head
  }

}

//object Solution {
//  def main(args: Array[String]) {
//    val printWriter = new PrintWriter(System.out)
//
//    val listHead = new SinglyLinkedList()
//
//    val listHeadCount = StdIn.readLine.trim.toInt
//
//    for (_ <- 0 until listHeadCount) {
//      val listHeadItem = StdIn.readLine.trim.toInt
//      listHead.insertNode(listHeadItem)
//    }
//
//    val x = StdIn.readLine.trim.toInt
//
//    val result = Result.removeNodes(listHead.head, x)
//
//    SinglyLinkedListPrintHelper.printList(result, "\n", printWriter)
//    printWriter.println()
//
//    printWriter.close()
//  }
//}
*/
