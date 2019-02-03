package com.nuxplanet.gatling.imperative

import com.nuxplanet.gatling.BaseSimulation

class ImperativeSimulation extends BaseSimulation {
  scenarioName = "imperative"
  numberOfUsers = 1000
  url = "http://3.121.222.50:8081"
  action = "/imperative/item"

  run()
}
