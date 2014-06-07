object HelloWorld {

  def main(args: Array[String]): Unit = {
    ore()
    omae()
  }

  def ore() {

    // method
    println(Ore.greeting())

    // use trait
    println(Ore.goodMorning())
    println(Ore.hello())
    println(Ore.goodNight())

    println(Ore.speech("Ore sama da!"))

  }

  def omae() {

    // method
    println(Omae.greeting())

    // use trait
    println(Omae.goodMorning())
    println(Omae.hello())
    println(Omae.goodNight())

    println(Omae.sayName())

  }

}
