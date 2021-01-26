package streetfinder

trait StreetFinder {
  //: List[String]
  def findStreets(streets: List[String], names: Set[String])={
    for (i <- names){
      println(Console.YELLOW +s"Number of $i named street : ${streets.filter(x => x contains i).length}")
      println(Console.WHITE+ streets.filter(x => x contains i))
    }
  }
}
