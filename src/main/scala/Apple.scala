case object Apple extends Fruit {

  val price = 0.6

  override def discountedPrice(quantity: Int): Double =  {

    Math.floor(quantity/2) * 0.6 + quantity%2 * 0.6

  }

}
