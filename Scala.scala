object Main {
  def main(args:Array[String]){ 
    var a = scala.io.StdIn.readInt()
    a match
    {
    case 1 =>println("January")
    case 2 =>println("February")
    case 3 =>println("March")
    case 4 =>println("April")
    case 5 =>println("May")
    case 6  =>println("June")
    case 7  =>println("July")
    case 8  =>println("August")
    case 9  =>println("September")
    case 10 =>println("October")
    case 11 =>println("November")
    case 12 =>println("December")
    case _ =>println("Invalid input")
    }
  }
}
