fun main(){
    var k=90
    if(k>9){
        println("Good day")
    }
    else{
        println("Bad day")
    }


    var str: String
    str= if(99<10){
        "Hello"
    }
    else{
        "World"
    }
    println(str)

    //You can ommit the curly braces {} when if has only one statement:
    var name= if(89!=89) "Ankita" else "Aradhana"
    println(name)


    val day = 8

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}