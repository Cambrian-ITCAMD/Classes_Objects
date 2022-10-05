// must be compiled *with* Student.kt
fun main(){
  //val student1 = Student("artem", 123456, 0f)
  val student1 = Student("Dhaval", 123456)

  println(student1.getName())
  println(student1.getGrade())

  try{
    student1.setGrade(101f)
  }
  catch(ex: Exception){
    println("Cannot update the grade")
  }
    println(student1.getName())
    //println("A00" + student.getID().toString())
    println(student1.getID())
    println(student1.getGrade())


    println((1..6).random())
}
