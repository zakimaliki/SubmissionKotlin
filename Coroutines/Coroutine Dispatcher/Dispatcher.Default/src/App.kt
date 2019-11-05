import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
    }
    launch(Dispatchers.Default) {
    }
    println("Dispatcher Default")
}