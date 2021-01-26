package streetfinder

import java.io.File

object Application extends App{
  val filePath= "src/data/streets.csv"

  //val file = new File(filePath)
  def open(path:String) = new File (path)

  val csvloader = new CsvLoader {}
  val streetfinder = new StreetFinder{}

  println(Console.BLUE+"---------------------- Welcome  to Street Finder ----------------------")
  println("Please write down how many street searches will do at once. (For quit : press q )")
  val numberOfInput = scala.io.StdIn.readLine()

  val readbypath=csvloader.loadCsv(open(filePath))


  val stringInputs = {
    var set :Set[String]= Set()
    if ( numberOfInput=="q") {
      println("Your loose")
      System.exit(0)}
    else
      listOfInputs(numberOfInput.toInt, set : Set[String])
  }

  def listOfInputs ( n : Int, s: Set[String]): Any={
    if(n==0) {
      println(Console.RED +"We are progressing your request. Please wait..")
      streetfinder.findStreets(readbypath,s)
      println(Console.BLUE +"---------------------- Good Bye ----------------------")
      System.exit(0)}
    else{
      println(Console.BLUE+"Please write down a word then press enter.")
      val desiredStreet: String = scala.io.StdIn.readLine().toString
      listOfInputs(n-1,s ++ Set(desiredStreet))

    }

  }

}


