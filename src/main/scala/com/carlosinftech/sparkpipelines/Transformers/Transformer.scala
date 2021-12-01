package com.carlosinftech.sparkpipelines.Transformers

import org.apache.spark.ml.PipelineStage
import org.apache.spark.sql.Dataset

trait Transformer extends PipelineStage{

    def transform(dataset: Dataset[_]):Dataset[_]
}
