import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking {
    val job = launch { // launch new coroutine and keep a reference to its Job
        delay(3000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes
}