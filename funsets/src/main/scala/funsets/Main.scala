package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(contains(singletonSet(1), 2))
  
  printSet(union(singletonSet(3), singletonSet(1)))
}
