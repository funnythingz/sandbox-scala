trait Greeting extends Hello with GoodMorning with GoodNight {

  val name: String

  def sayName(): String = name

}

trait GoodMorning {

  def goodMorning(): String = "Good morning!"

}

trait Hello {

  def hello(): String = "Hello!"

}

trait GoodNight {

  def goodNight(): String = "Good night!"

}
