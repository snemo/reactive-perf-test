package com.nuxplanet.gatling.reactive

import com.nuxplanet.gatling.BaseSimulation

class ReactiveSimulation extends BaseSimulation{
  scenarioName = "reactive"
  numberOfUsers = 1000
  url = "http://3.121.235.198:8081"
  action = "/reactive/item"

  run()
}
