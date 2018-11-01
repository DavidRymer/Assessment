case object Orange extends Fruit {

  val price = 0.25

  override def discountedPrice(quantity: Int): Double =  {

    Math.floor(quantity/3) * 0.5 + quantity%3 * 0.25

  }

}
