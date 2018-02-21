import org.scalatest.{Matchers, WordSpec}
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._

class RouteSpec extends WordSpec with Matchers with ScalatestRouteTest {

  val route = Main.route

  "The service" should {

    "Respond with OK on status check" in {
      Get("/v1/status") ~> route ~> check {
        status shouldEqual StatusCodes.OK
      }
    }

    "Send proper welcome string" in {
      Get() ~> route ~> check {
        responseAs[String] shouldEqual "Hello, world!"
      }
    }

  }

}
