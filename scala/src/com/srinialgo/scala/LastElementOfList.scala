package com.srinialgo.scala

import scala.util.Random
import java.util.Random
import java.util.NoSuchElementException


class LastElementOfList{
  
  //using built in
  def lastBuiltin[A](ls: List[A]): A = ls.last

  //using recursion
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
  
   def sum(xs: List[Int]): Int = xs match{
      case a:: b :: Nil => a+b
      case x :: tail => x+sum(tail)  
      case _ => throw new NoSuchElementException
    }
   
   
}
object LastElementOfListRunner extends App{
  
  val l = new LastElementOfList()
  
//  println(l.lastRecursive( List("sravy","rahu","goutham","subba","divya","rahul","parthu")))
//  
//  println(l.lastBuiltin(List("parthu","rahu","goutham","subba","divya","rahul","sravy")))
  
  scala.math.BigInt
    
  def random(x:Int): Array[Int]= {
    
    var arr = new Array[Int](x)
 
    for(i <- 0 to x-1){

     arr(i) = i
      
    }
     arr
  }
  
 // val list = random(883920).toList
    
  // println(l.sum(list))
  
  def sum(xs: List[Int]): Int = {
    
     if(xs.isEmpty) throw new NoSuchElementException

     import scala.annotation.tailrec
      @tailrec
      def sumList(xs:List[Int],sm:Int): Int={
        if(xs.isEmpty) sm
        else sumList(xs.tail,sm+xs.head)
      }
      sumList(xs,0)

    }
  
  println(sum(List(1,2,3,4,5,6,7,8,9,10,11,12,13,14)))
  
   def max(xs: List[Int]): Int = {
    
     if(xs.isEmpty) throw new java.util.NoSuchElementException 
       
      def recmax(xs:List[Int],accu:Int):Int = {
        
        if(xs.isEmpty) accu
         else{
          recmax(xs.tail, math.max(accu,xs.head))
        }
      }
      recmax(xs,xs.head)
    }
   println(max(List(1,2,3,4,5,6,27,8,9,10,11,12,13,14)))
   
   println(max(List(0,0,0,0)))
   
    println(sum(List(0,0,0,0)))
 
}