package com.carlosinftech.sparkpipelines.readersAndWriters

import org.apache.spark.sql.Dataset

trait Writer {

  def writeData(dataset: Dataset[_]): Unit
}
