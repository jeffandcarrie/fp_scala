package greeter

object play {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(13); 
  
  val x=1;System.out.println("""x  : Int = """ + $show(x ));$skip(28); 
  
  def inc(x : Int) = x+1;System.out.println("""inc: (x: Int)Int""");$skip(12); val res$0 = 
  
  inc(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(12); val res$1 = 
  
  inc(6);System.out.println("""res1: Int = """ + $show(res$1))}
}
