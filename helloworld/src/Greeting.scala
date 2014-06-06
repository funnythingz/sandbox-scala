trait Greeting {

  val name: String

  def say(message: String): String = message

  def sayName(): String = name

  def goodMorning(): String = "Good morning!"

  def hello(): String = "Hello!"

  def goodNight(): String = "Good night!"

}
