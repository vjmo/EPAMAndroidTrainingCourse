class PopWorker(private val stack: Stack) : Thread() {
    override fun run() {
        while (true) {
            if (!Thread.interrupted()) {
                stack.pop()
            } else return
        }
        println("Stop ----- ${Thread.currentThread().name}")
    }
}