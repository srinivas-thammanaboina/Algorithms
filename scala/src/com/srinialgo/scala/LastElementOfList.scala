package com.srinialgo.scala


class LastElementOfList{
  
  //using built in
  def lastBuiltin[A](ls: List[A]): A = ls.last

  //using recursion
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
  
}
object LastElementOfListRunner extends App{
  
  val l = new LastElementOfList()
  
  println(l.lastRecursive( List("sravy","rahu","goutham","subba","divya","rahul","parthu")))
  
  println(l.lastBuiltin(List("parthu","rahu","goutham","subba","divya","rahul","sravy")))
  
}