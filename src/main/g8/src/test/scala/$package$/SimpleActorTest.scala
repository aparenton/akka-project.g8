package com.aparenton.default.routing

import $package$.SimpleActor
import akka.actor.ActorSystem
import akka.actor.Actor
import akka.testkit.{TestKit, TestActorRef}
import org.scalatest.MustMatchers
import org.scalatest.WordSpecLike

class SimpleTest extends TestKit(ActorSystem("testSystem"))
  with WordSpecLike
  with MustMatchers {

  "A simple actor" must {
    // Creation of the TestActorRef
    val actorRef = TestActorRef[SimpleActor]

    "receive messages" in {
      // This call is synchronous. The actor receive() method will be called in the current thread
      actorRef ! "World"
      // With actorRef.underlyingActor, we can access the SimpleActor instance created by Akka
      actorRef.underlyingActor.lastName must equal("World")
    }
  }
}
