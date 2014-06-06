/**
 * Created by funnythingz on 2014/06/06.
 */
object HelloWorld {

  def main(args: Array[String]) {

    println(Ore.greeting())

  }

}

object Ore {

  val firstMessage: String = "Hey!"

  def greeting(): String = firstMessage

}