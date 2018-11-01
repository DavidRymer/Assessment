object Shop extends App {

  def revenue(fruit: Fruit*) = {

    fruit.foldLeft(0.0)(_ + _.price)

  }
  println(s"The price of two apples and an orange is: £${revenue(Apple, Apple, Orange)}")

}
