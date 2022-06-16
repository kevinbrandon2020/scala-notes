package chapter4

object Closure {
  def main(args: Array[String]): Unit = {
    var more = 1;
    val moreAdd = (x:Int) => x + more
    println(moreAdd(100))
    more = 99999;
    println(moreAdd(10))
    val list1 = List(-11, -10, 200, -145)
    var sum = 0
    list1.foreach(sum += _)
    println(sum)
    var inc1 = makeIncreaser(1)
    var inc2 = makeIncreaser(999)
    println(inc1(10))
    println(inc1(11))
    println(inc2(10))
    println(inc2(11))
  }
  def makeIncreaser(more:Int) = (x:Int) => (x + more)
}
