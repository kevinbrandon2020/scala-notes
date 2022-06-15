package chapter1

class Student (age: Int, name: String){
    def printInfo():Unit = {
      println("name" + name + "age" + age + Student.school)
    }
}
object Student{
  val school:String = "yanshanschool"
  val a = "aaa"
  val a1 = 10

  /**
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
   val xusu =  new Student(10, "xusu")
   xusu.printInfo()
  }
}
