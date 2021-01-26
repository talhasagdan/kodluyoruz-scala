package flist

object FListDemo {
  def main(args: Array[String]): Unit = {
    val list = (1 to 100 by 2).toList
    val flist1 = FList(6 ,5 ,4)
    val flist2 = FList(list)
    val flist3 = FList("hello", "world")
    val flist4  = FList()

    //test concat
    println(flist4.concat(flist1))
    // test fold
    println(flist1.fold(0)((a,b )=> a+b))
    //test filter
    println(flist1.filter(_%2 ==0))
    //test flatmap
    val toPair = (x: Int) => FList(x, x+1)
    println(flist1.flatMap(toPair).toString)
    
  }
}
