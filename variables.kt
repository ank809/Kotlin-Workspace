/* Variable are used to store values
To create a variable, use var or val

difference between var and val is that variables declared with the var keyword can be changed/modified,
while val variables cannot.
 */
fun main(){
    var name= "Ankita"
    val a= 10
    println(name)
    println(a)
    name= "Radha"
    // a=30 this cannot be done as variable assigned to val cannot be reassigned
    println(name)


   // You can also declare a variable without assigning the value, and assign the value later.
   // However, this is only possible when you specify the type:
    val lastname:String
    lastname= "Thakur"
    println(lastname)
    // but you cannot do like this as this will generate an error
//    var lastname1
//    lastname1= "Sharma"
    println(name+" " +lastname)

}