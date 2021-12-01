package com.carlosinftech.sparkpipelines.readersAndWriters

import org.apache.spark.sql.Dataset

trait Reader {

  def loadDataset: Dataset[_]
}

