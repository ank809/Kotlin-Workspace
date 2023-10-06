fun main(){
    var name: String
    name= "Ankita"
    var lastname="Thakur"
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

    // for finding a string in a sentence
    // starts counting from the first index
    var txt :String
    txt = "Please locate where this text occurs!"
    println(txt.indexOf("this"))
    var text= "It's so kind of you"
    println(text)
    // joining two strings
    println("Name is "+ name+lastname)
    println("Your name is "+name.plus(lastname))

    //String Templates/Interpolation
    println("Shubh nam $name $lastname")


}