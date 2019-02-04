package com.nuxplanet.gatling

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class OneItemSimulation extends Simulation {
  var scenarioName = "basic"
  var numberOfUsers = 1000
  var rampDuration = 1
  var url = "http://localhost:8080"
  var action = "/reactive/item"

  def run()  {
    val httpConf = http
      .baseUrl(url)
      .warmUp(url)

    val simpleRecord = scenario("OneSimpleRecord")
                .exec(http(scenarioName + ": " + action).get(action))
                .exec()

    setUp(simpleRecord.inject(rampUsers(numberOfUsers).during(rampDuration)))
      .protocols(httpConf)
  }
}


