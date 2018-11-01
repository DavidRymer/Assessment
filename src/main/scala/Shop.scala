object Shop extends App {

  def revenue(fruit: Fruit*) = {

    fruit.foldLeft(0.0)(_ + _.price)

  }

  println(s"The price without discount of two apples and an orange is: £${revenue(Apple, Apple, Orange)}")

  def revenueWithDiscount(fruit: Fruit*) = {
    fruit
      .groupBy(identity)
      .mapValues(_.size)
      .foldLeft(0.0)((accum, fruit) => accum + fruit._1.discountedPrice(fruit._2))
  }

  println(s"The price with discount of two apples and an orange is: £${revenueWithDiscount(Apple, Apple, Orange)}")

}
