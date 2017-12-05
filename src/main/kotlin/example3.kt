import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking { // start main coroutine
    launch { // launch new coroutine in background and continue
        delay(3000L)
        println("World!")
    }

    println("Hello,") // main coroutine continues here immediately
    delay(time = 6000L)      // delaying for 2 seconds to keep JVM alive
}