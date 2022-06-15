package chapter3

object DateType {
  def main(args: Array[String]): Unit = {
    val a: Byte = 10
    val b: Byte = 20
    val c: Byte = (a + b).toByte
    println(c)
    val d = 2.313
    val e:Float = 0.323f
    val arr:List[String] = List("a", "b")
    // + 靠近arr侧代表在数组外侧添加某一值， ：靠近list某一值代表在list中加入某一值
    val arr1 ="c" +: arr
    val arr2 =arr ++: "d"
    val arr3 ="c" :+ arr
    val arr4 =arr :+ "e"
    println(arr1)
    println(arr2)
    println(arr3)
    println(arr4)
    for (a <- arr4) println(a)
  }
}
