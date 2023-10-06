fun main(){
    var name: String
    name= "Ankita"
    var name1= "ankitA"

    // if you want to extract a character at a particular index use [], 0 is the first elementt
    println(name[2])
    println(name[5])
    println(name[4])

    // for finding length of string

    println("The length of your name is "+name.length)
    // string to uppercase
    println("Converted string to uppercase "+name.uppercase())
    println("Converted string to lower   "+name.lowercase())

    // comparison of two strings
    println(name.compareTo(name1))
}