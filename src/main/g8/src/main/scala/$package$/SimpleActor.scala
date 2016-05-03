package $package$

import akka.actor.Actor

class SimpleActor extends Actor {

  var lastName = ""

  def receive = {
    case name: String => {
      lastName = name
      sender ! s"Hello \$name!"
    }
  }
}
