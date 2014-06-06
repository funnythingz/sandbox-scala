/**
 * Created by funnythingz on 2014/06/06.
 */
object HelloWorld {

  def main(args: Array[String]) {

    // method
    println(Ore.greeting())

    // use trait
    println(Ore.goodMorning())
    println(Ore.hello())
    println(Ore.goodNight())

  }

}

object Ore extends Greeting {

  val firstMessage: String = "Hey!"

  def greeting(): String = firstMessage

}

trait Greeting {

  def goodMorning(): String = "Good morning!"

  def hello(): String = "Hello!"

  def goodNight(): String = "Good night!"

}