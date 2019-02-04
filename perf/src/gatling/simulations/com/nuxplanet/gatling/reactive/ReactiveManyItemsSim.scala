package com.nuxplanet.gatling.reactive

import com.nuxplanet.gatling.ManyItemsSimulation

class ReactiveManyItemsSim extends ManyItemsSimulation{
  scenarioName = "reactive-one-item"

  //url = "http://3.121.235.198:8081"
  url = "http://127.0.0.1:8090"
  action = "/reactive/items"

  run()
}
