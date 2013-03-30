package greeter

object play {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x=1                                         //> x  : Int = 1
  
  def inc(x : Int) = x+1                          //> inc: (x: Int)Int
  
  inc(4)                                          //> res0: Int = 5
  
  inc(6)                                          //> res1: Int = 7
}