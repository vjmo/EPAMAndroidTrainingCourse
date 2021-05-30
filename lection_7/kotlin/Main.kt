import java.util.concurrent.Callable
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    //  *** TASK 1 ***

    Thread(Runnable {
        for (i in 0..5) {
            println("First thread: ${Thread.currentThread().name}")
        }
        Thread.sleep(5000)

        Thread(Runnable {

            for (i in 0..5) {
                println("Second thread: ${Thread.currentThread().name}")
            }
        }).start()
    }).start()

    println("I'm run!")
    Thread().start()
    Thread.currentThread().name

    // *** TASK 2 ***

    var testStack: Stack<Int> = Stack()
    testStack.push(4)
    testStack.printStack()
    testStack.pop()
    testStack.printStack()
    testStack.push(6)
    testStack.printStack()

    Thread(Runnable {
        var stackFactory: StackFactory<Int> = StackFactory()
        stackFactory.createStack()
        println("Thread ${Thread.currentThread().name} creates a stack.")
    }).start()


    Thread(Runnable {
        var popWorker: PopWorker<Int> = PopWorker(testStack)
        println("Thread ${Thread.currentThread().name} popped an item from the stack.")
        println("Thread ${Thread.currentThread().name} interrupted.")
    }).start()

    Thread(Runnable {
        var pushWorker: PushWorker<Int> = PushWorker(testStack, element = 7)
        println("Thread ${Thread.currentThread().name} added an item to the stack.")
        println("Thread ${Thread.currentThread().name} interrupted.")
    }).start()

    // *** TASK 3 ***

    var executorSingle = Executors.newSingleThreadExecutor()
    for (task in 1..3)
        executorSingle.execute(Task())
    println("Shutdown executor")
    executorSingle.shutdown()

    var executorFixed = Executors.newFixedThreadPool(3)
    for (task in 1..5) {
        executorFixed.submit(Callable {
            println("Callable Task! ${Thread.currentThread().name}")
        })
    }
    println("Shutdown executor")
    executorFixed.shutdown()

    var executorCached = Executors.newCachedThreadPool()
    for (task in 1..3)
        executorCached.execute(Task())
    println("Shutdown executor")
    executorCached.shutdown()

    var executorScheduled = Executors.newScheduledThreadPool(2)
    executorScheduled.execute(Task())
    Thread.sleep(3000)
    executorScheduled.execute(Task())
    Thread.sleep(3000)
    executorScheduled.execute(Task())
    Thread.sleep(3000)
    executorScheduled.shutdown()
}
