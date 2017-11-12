package com.srinialgo.scala

class LastButOneElementOfList {
  
  def buitIn[A](ls : List[A]):A = {
    if(ls.isEmpty){
       throw new NoSuchElementException
    }
    else{
      ls.init.last
    }
  }
  
  def recursionWay[A](ls : List[A]):A = ls match {
    case a::_::Nil => a
    case a::tail => recursionWay(tail)
    case Nil=> throw new NoSuchElementException
   }
  }

object LastButOneElementOfListRunner{

 def main(args: Array[String]): Unit = {
    
    val lt = new LastButOneElementOfList
    println(lt.buitIn(List("sravy","rahu","goutham","subba","divya","rahul","parthu")))
    println(lt.recursionWay(List("sravy","rahu","goutham","subba","divya","parthu","rahul")))
  }
}