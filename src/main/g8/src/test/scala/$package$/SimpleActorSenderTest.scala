package com.aparenton.default.routing

import $package$.SimpleActor
import akka.actor.ActorSystem
import akka.actor.Actor
import akka.testkit.{ImplicitSender, TestKit, TestActorRef}
import org.scalatest.MustMatchers
import org.scalatest.WordSpecLike

class SimpleActorSenderTest extends TestKit(ActorSystem("testSystem"))
  // Using the ImplicitSender trait will automatically set `testActor` as the sender
  with ImplicitSender
  with WordSpecLike
  with MustMatchers {

  "A simple actor" must {
    "send back a result" in {
      // Creation of the TestActorRef
      val actorRef = TestActorRef[SimpleActor]
      actorRef ! "akka"
      // This method assert that the `testActor` has received a specific message
      expectMsg("Hello akka!")
    }

  }
}
