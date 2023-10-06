fun main(){
    var i=1;
    while(i<10){
        ++i
        println(i)

    }

    // do while loop
    var j=0
    do{
        println(j)
        j++
       if(j==6){
           break // came out of loop
       }

    }while(j<10)

    // continue :continue statement breaks one iteration (in the loop),
    // if a specified condition occurs, and continues with the next iteration in the loop.
    var k = 0
    while (k < 10) {
        if (k == 4) {
            k++
            continue
        }
        println(k)
        k++
    }
}


