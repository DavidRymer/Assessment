import org.scalatest.{FlatSpec, Matchers}

class ShopTest extends FlatSpec with Matchers {

  "This input for the function revenue" should "return 2.05" in {

    assertResult(Shop.revenue(Apple, Apple, Orange, Apple)){2.05}

  }

  "This input for the function revenue" should "return 1.2" in {

    assertResult(Shop.revenue(Apple, Apple)){1.2}

  }

  "This input for the function revenue" should "return 0.5" in {

    assertResult(Shop.revenue(Orange, Orange)){0.5}

  }

  "This input for the function revenue" should "return 0.0" in {

    assertResult(Shop.revenue()){0.0}

  }

  "This input for the function revenue" should "return 2.4" in {

    assertResult(Shop.revenue(Apple, Apple, Apple, Apple)){2.4}

  }

  "This input for the function revenue" should "return 1.0" in {

    assertResult(Shop.revenue(Orange, Orange, Orange, Orange)){1.0}

  }

}
