package com.carlosinftech

import org.apache.spark.sql.SparkSession

package object sparkpipelines {

  lazy val spark: SparkSession = SparkSession.builder().appName("sparkmlpipelines").getOrCreate()

}
