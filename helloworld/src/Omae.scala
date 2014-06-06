object Omae extends Greeting {

  val name: String = "Omae";

  val firstMessage: String = "Omae da!"

  def greeting(): String = firstMessage

  override def hello(): String = "Hello Omae"

}
