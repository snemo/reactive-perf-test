package com.nuxplanet.gatling.imperative

import com.nuxplanet.gatling.BaseSimulation

class ImperativeSimulation extends BaseSimulation {
  scenarioName = "imperative"
  numberOfUsers = 1000
  url = "http://localhost:8081"
  action = "/imperative/item"

  run()
}
