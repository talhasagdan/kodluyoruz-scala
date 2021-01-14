package code

import java.io.File

trait CsvLoader {
  //: List[String]
  def loadCsv(file: File): List[String]={
    val sc : List[String]= io.Source.fromFile(file).getLines.map(_.split(",")(1)).toList
    sc
  }




}
