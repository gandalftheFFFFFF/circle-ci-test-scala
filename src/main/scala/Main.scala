import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

object Main extends App {
  implicit val actorsystem = ActorSystem("actorsystem")
  implicit val executior = actorsystem.dispatcher
  implicit val materializer = ActorMaterializer()

  def route: Route = {
    get {
      pathSingleSlash {
        complete("Hello, world!")
      } ~
      pathPrefix("v1") {
          path("status") {
              complete(StatusCodes.OK)
        }
      }
    }
  }

  Http().bindAndHandle(route, "0.0.0.0", 8080)
}
