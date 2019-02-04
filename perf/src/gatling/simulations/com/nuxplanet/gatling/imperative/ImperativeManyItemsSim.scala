package com.nuxplanet.gatling.imperative

import com.nuxplanet.gatling.ManyItemsSimulation

class ImperativeManyItemsSim extends ManyItemsSimulation {
  scenarioName = "imperative-many-items"
  //url = "http://3.121.222.50:8081"
  url = "http://127.0.0.1:8081"
  action = "/imperative/items"

  run()
}
