import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun main() {

    //  *** TASK 1 ***

    println("Main thread: ${Thread.currentThread().name}")

    val threadFirst = Thread {
        println("First thread: ${Thread.currentThread().name}")
        Thread.sleep(5000)

        val secondThread = Thread {
            println("Second thread: ${Thread.currentThread().name}")
        }
        secondThread.start()
        secondThread.join()
    }
    threadFirst.start()
    threadFirst.join()

    println("I'm run! ${Thread.currentThread().name}")

    // *** TASK 2 ***

    val testStack = StackFactory.createStack()

    val testPushWorker = PushWorker(testStack)
    println("$testPushWorker added an item to the stack.")
    testPushWorker.start()

    val testPopWorker = PopWorker(testStack)
    println("$testPopWorker popped an item from the stack.")
    testPopWorker.start()

    Thread.sleep(3000)

    try {
        testPushWorker.interrupt()
        println("$testPushWorker interrupted.")

        testPopWorker.interrupt()
        println("$testPopWorker interrupted.")
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }

    // *** TASK 3 ***

    val executorSingle = Executors.newSingleThreadExecutor()
    for (task in 0..2)
        executorSingle.execute { println(Thread.currentThread().name) }
    executorSingle.shutdown()

    val executorFixed = Executors.newFixedThreadPool(3)
    for (task in 0..4) {
        executorFixed.submit(Callable {
            println("Callable Task! ${Thread.currentThread().name}")
        })
    }
    executorFixed.shutdown()

    val executorCached = Executors.newCachedThreadPool()
    for (task in 0..2)
        executorCached.execute { println(Thread.currentThread().name) }
    executorCached.shutdown()

    val executorScheduled = Executors.newScheduledThreadPool(2)
    executorScheduled.execute {
        for (task in 0..2) {
            println(Thread.currentThread().name)
            Thread.sleep(3000)
        }
    }
    executorScheduled.shutdown()
}
