fun main() {

    peoplesheight(listOf(25,90,34))
    personNames()




}
// 1 .Given a list of 10 strings, write a function that returns a list of the strings
//t even indices i.e index 2,4,6 etc
fun list(names:List<String>):List<String> {
   val people   = mutableListOf<String>()
  for (i in names.indices step 2) {
   people    .add(names[i])
  }
    return people

}


// 2 .Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height


fun peoplesheight (heigth:List<Int>){
    val average = heigth.average()
    val heigth = heigth.sum()
    println(average)
    println(heigth)
}




// 3 .Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age


data class Person (var name:String,var age :Int,var heigth:Int,var weigth:Double)
fun personNames(){
    val persont= Person("sara",18,160,66.7)
    val personv =Person("wayne",12,158,65.5)
    val persond = Person("ann",45,75,56.8)
    var personList = listOf(persont,personv,persond)
    var sorted = personList.sortedByDescending { person -> person.age }
    println(sorted)
}








// 4 .4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.










//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.




