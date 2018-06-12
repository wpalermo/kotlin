fun main(args: Array<String>) {

    val hour : Int = args[0].toInt()
    val greetings = "${if(hour < 12) "Good Morning" else "Good Night"}"
    println(greetings)


}