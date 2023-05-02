fun main() {
    person("Nancy",21,"Kenyan")
    println(addition(10,20,30,40))
    println( averageNumber(30.6,20.4,5.2,21.1,12.3))
    val name = "Mercy"
    val age = 20;
    val phonenumber = 706007173;
    val email = "nsaruwawasi@gmail.com"
    val weight = 50.9;
    val isKenyan = true
    student(name,age,phonenumber,email,weight,isKenyan)
}
//Create and invoke a function that takes in a users name, age, and
// nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya”
fun person(name: String,age: Int,nationality: String){
    println("Hello my name is ${name}, I am ${age} and I am from ${nationality}.")
}


//2. Create and invoke a function that returns the sum of any given 4 numbers
fun addition(num1: Int,num2: Int,num3: Int,num4: Int): Int{
    var add = num1 + num2 + num3 + num4
    return add
}
//3. Create and invoke a function that given any 5 numbers, it returns their average
fun averageNumber(num1: Double,num2: Double,num3: Double,num4: Double,num5: Double): Double{
    return  (num1 + num2 +num3 +num4 + num5/5)
}

//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
fun student(name: String, age: Int, phonenumber: Int, email:String, weight: Double, citizen: Boolean) {
    println("$name")
    println("$age")
    println("$phonenumber")
    println("$email")
    println("$weight")
    println("$citizen")

}
