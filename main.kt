fun main() {
    println("Booting the crappy os...")
    Thread.sleep(1000)
    println("Loading data")
    Thread.sleep(1000)
    println("Welcome to C-Bos Kotlin Edition! Type help for a list of commands")
    
    while (true) {
        print("> ")
        var cmd = readLine()!!.toLowerCase()

        if (cmd == "help") {
            println("1: Exit")
            println("2: Magic eight ball")
        } else if (cmd == "exit") {
            println("Exiting...")
            Thread.sleep(500)
            System.exit(0)
        } else if (cmd == "magic eight ball") {
            var responses = listOf("Idk bro", "Yes bro", "No bro")
            var randomInt = (0..2).shuffled().first()
            println(responses[randomInt])
        }

        else {
            println("Unknown command")
        }
    }
}