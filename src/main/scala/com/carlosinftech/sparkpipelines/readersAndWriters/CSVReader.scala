package com.carlosinftech.sparkpipelines.readersAndWriters
import org.apache.spark.sql.Dataset
import com.carlosinftech.sparkpipelines.spark

class CSVReader(path:String,
                separator:String) extends Reader{

  override def loadDataset: Dataset[_] = spark.read.option("separator",separator).csv(path)

}
