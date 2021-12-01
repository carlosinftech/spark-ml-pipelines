package com.carlosinftech.sparkpipelines.readersAndWriters
import org.apache.spark.sql.Dataset

class CSVWriter(path:String) extends Writer{
  override def writeData(dataset: Dataset[_]): Unit = dataset.write.csv(path)
}
