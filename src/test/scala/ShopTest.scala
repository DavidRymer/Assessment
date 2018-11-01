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

  "This input for the function revenueWithDiscount" should "return 1.10" in {

    assertResult(Shop.revenueWithDiscount(Apple, Apple, Orange, Orange, Orange)){1.10}

  }

  "This input for the function revenueWithDiscount" should "return 1.20" in {

    assertResult(Shop.revenueWithDiscount(Apple, Apple, Apple)){1.20}

  }

  "This input for the function revenueWithDiscount" should "return 0.85" in {

    assertResult(Shop.revenueWithDiscount(Orange, Apple)){0.85}

  }

  "This input for the function revenueWithDiscount" should "return 0.0" in {

    assertResult(Shop.revenueWithDiscount()){0.0}

  }

  "This input for the function revenueWithDiscount" should "return 0.6" in {

    assertResult(Shop.revenueWithDiscount(Apple)){0.6}

  }

  "This input for the function revenueWithDiscount" should "return 0.25" in {

    assertResult(Shop.revenueWithDiscount(Orange)){0.25}

  }



}
