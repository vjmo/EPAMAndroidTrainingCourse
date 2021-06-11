class Task : Runnable {
    override fun run() {
        println("Running Task! Thread - ${Thread.currentThread().name}")
    }
}