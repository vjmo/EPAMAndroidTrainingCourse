class PushWorker<T>(private val stack: Stack<T>, private val element: T) : Runnable {
    override fun run() {
        stack.push(element)
        Thread.sleep(3000)
        Thread.interrupted()
    }
}