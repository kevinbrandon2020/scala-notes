package chapter2

import java.io.{File, PrintWriter}
import scala.io.Source

object ReadFile {
  def main(args: Array[String]): Unit = {
    Source.fromFile("/Users/sun9/IdeaProjects/scala-study/src/main/resources/english_file").foreach(print)
    var write = new PrintWriter(new File("/Users/sun9/IdeaProjects/scala-study/src/main/resources/output"))
    write.write("write success")
    write.close()
  }
}
