fun main(args: Array<String>) {
    //pembuatan array berdasarkan template Array standard Kotlin
    val asc = Array(5){
        i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}