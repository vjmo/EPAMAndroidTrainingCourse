class PopWorker<T>(private val stack: Stack<T>) : Runnable {
    override fun run() {
        stack.pop()
        Thread.sleep(3000)
        Thread.interrupted()
    }
}