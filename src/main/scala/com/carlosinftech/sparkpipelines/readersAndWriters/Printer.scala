package com.carlosinftech.sparkpipelines.readersAndWriters
import org.apache.spark.sql.Dataset

class Printer extends Writer{
  override def writeData(dataset: Dataset[_]): Unit = dataset.show(false)
}
