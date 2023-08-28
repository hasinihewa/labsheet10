package Labsheet10

object q1 {
  private def CalculateAverage(listC: List[Double]): Double = {
    val listF = listC.map(l => (l * 1.8) + 32)
    val totalF = listF.reduce((a, b) => a + b)
    val averageF = totalF / listF.length
    averageF
  }

  def main(args: Array[String]): Unit = {
    println("Enter temperatures in celsius separated by commas:")
    val celsiustemp = scala.io.StdIn.readLine()
    val temp = celsiustemp.split(",").map(_.toDouble).toList
    println("Average Fahrenheit temperature:", CalculateAverage(temp))
  }
}
