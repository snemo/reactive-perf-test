package com.nuxplanet.gatling

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class BaseSimulation extends Simulation {
  var scenarioName = "basic"
  var numberOfUsers = 1
  var rampDuration = 1
  var url = "http://localhost:8080"
  var action = "/reactive/item"


  def run()  {
    val httpConf = http
      .baseUrl(url)
      .warmUp(url)
    val scn = scenario("scenarioName")
      .exec(http(scenarioName + ": " + action)
        .get(action))


    setUp(scn.inject(rampUsers(numberOfUsers).during(rampDuration)))
      .protocols(httpConf)
  }

}


