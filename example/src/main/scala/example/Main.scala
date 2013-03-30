package example
import example.Lists._

object Main extends App {
    def aList = List(1,3,99,4)
    
	println( Lists.max(aList))

	println(Lists.sum(aList))
}