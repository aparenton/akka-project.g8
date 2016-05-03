package $package;format="lower"$

import scala.concurrent.duration._
import scala.concurrent.Await
import akka.actor.{Props, ActorSystem}
import akka.io.IO
import akka.util.Timeout
import $package$.util.Configuration._

object $name;format="Camel"$ extends App {
  implicit val system = ActorSystem("$name;format="lower"$")

  val simpleActor = system.actorOf(Props[SimpleActor], "simpleActor")

  simpleActor ! "World"

  scala.sys.addShutdownHook {
    system.terminate()
    Await.result(system.whenTerminated, 15 seconds)
  }
}
