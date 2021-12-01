package com.carlosinftech.sparkpipelines.Transformers
import org.apache.spark.ml.PipelineStage
import org.apache.spark.ml.param.ParamMap
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.functions.{col, concat}
import org.apache.spark.sql.types.StructType

class ConcatTransformer(
                        firstColumn:String,
                        secondColumn:String,
                        outputColumnName:String
                       ) extends Transformer {
  def transform(dataset: Dataset[_]): Dataset[_] = {
    dataset.withColumn(outputColumnName,concat(col(firstColumn),col(secondColumn)))
  }

  override def transformSchema(schema: StructType): StructType = new StructType()

  override def copy(extra: ParamMap): PipelineStage = {}

  override val uid: String = _
}
