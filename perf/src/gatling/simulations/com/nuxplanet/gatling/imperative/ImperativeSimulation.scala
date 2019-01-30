package com.nuxplanet.gatling.imperative

import com.nuxplanet.gatling.BaseSimulation

class ImperativeSimulation extends BaseSimulation {
  scenarioName = "reactive"
  numberOfUsers = 1000
  url = "http://localhost:8080"
  action = "/reactive/item"

}
