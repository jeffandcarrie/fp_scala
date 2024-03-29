package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1 (t)
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == c) 1
    else {
      pascal(c, r - 1) + pascal(c - 1, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def isBalanced(openCount: Int, chars: List[Char]): Boolean = {

      if (chars.isEmpty) openCount == 0
      else if (chars.head == '(') isBalanced(openCount + 1, chars.tail)
      else if (chars.head == ')') {
        //if we have a end paren we need at least one outstanding open paren
        if (openCount > 0)
          isBalanced(openCount - 1, chars.tail)
        else
          false
      } else isBalanced(openCount, chars.tail)
    }

    isBalanced(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else {
       countChange(money, coins.tail) +            // no coins of this denom
       countChange(money - coins.head, coins)      // 1 coin of this denom
    }

  }
}
