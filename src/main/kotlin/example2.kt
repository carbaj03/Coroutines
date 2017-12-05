import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    launch { // launch new coroutine in background and continue
        delay(3000L)
        println("World!")
    }
    
    println("Hello,") // main thread continues here immediately
    runBlocking {     // but this expression blocks the main thread
        delay(6000L)  // ... while we delay for 2 seconds to keep JVM alive
    }
}