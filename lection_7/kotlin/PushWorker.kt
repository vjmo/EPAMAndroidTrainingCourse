import java.util.*

class PushWorker(private val stack: Stack) : Thread() {
    override fun run() {
        while (true) {
            if (!Thread.interrupted()) {
                stack.push()
            } else return
        }
        println("Stop ----- ${Thread.currentThread().name}")
    }
}