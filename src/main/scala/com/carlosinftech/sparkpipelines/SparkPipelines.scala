package com.carlosinftech.sparkpipelines

import com.carlosinftech.sparkpipelines.Transformers.ConcatTransformer
import com.carlosinftech.sparkpipelines.readersAndWriters.CSVReader
import org.apache.spark.ml.Pipeline

/**
 * @author ${user.name}
 */
object SparkPipelines {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {

    val pipeline = new Pipeline()
    val inputPath = "src/test/resources/dummy_input.csv"
    val csvReader = new CSVReader(inputPath,",")
    val inputDataset = csvReader.loadDataset
    val concatTransformer = new ConcatTransformer("fruta","arbol","frutarbol")
    pipeline.setStages(Array(concatTransformer))
    outputDataset = pipeline.fit(inputDataset)
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
