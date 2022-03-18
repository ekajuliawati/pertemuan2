fun main(args: Array<String>) {
    // Array Method
    // Sort()
    val simpsonsA = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA){
        print(simpson + ' ')
    }
    print("\n")

    // sorted()
    val simpsonsB: Array<String> = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')

    // reserve() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC){
        print(simpson + ' ')
    }
    print('\n')

    // indexof()
    val simpsonD = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    val simpson = "Lisa"
    val position = simpsonD.indexOf(simpson)
    if (position !=-1){
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    val simpsonsE = arrayOf("Homer","Marge","Bart","Lisa","Meggie")
    println("simpson size: " + simpsonsE.size)
    if (!simpsonsE.isEmpty())
        println("Array tidak kososng!")
    println("Min = " + simpsonsE.minOrNull())
    println("Max = "+ simpsonsE.maxOrNull())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}