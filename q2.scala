package Labsheet10

object q2 {

  def main(args: Array[String]): Unit = {
    println("Enter words separated by commas:")
    val words = scala.io.StdIn.readLine()
    val Words = words.split(",").map(_.toString).toList
    val totalletterOccurence = countLetterOccurrences(Words);
    println("Total count of letter occurrences:" + totalletterOccurence);
  }

  def countLetterOccurrences(Words: List[String]): Int = {
    val lengthCalculate = Words.map(word => (word.length))
    val lettersOccurrence = lengthCalculate.reduce((a, b) => a + b)

    return lettersOccurrence
  }


  }



