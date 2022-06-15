package chapter2

object StringUtils {
  def main(args: Array[String]): Unit = {
    val a = "xu su"
    val b = "very good"
    print(a + b)
    printf("%s is %s", a, b)
    println(s"${a} is ${b}")
    val c: Double = 2.345
    println(f"this number is ${c}%2.2f")
    println(raw"this number is ${c}%2.2f")
    println(raw"this number is ${c}%2.2f")
    val sql = s"""
       |select
       |*
       |from
       |student
       |where
       |name = ${a}
       |and age > ${b}
       |""".stripMargin
    print(sql)
  }

}
