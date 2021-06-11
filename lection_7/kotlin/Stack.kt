import java.util.*

open class Stack {

    private val itemsList: MutableList<Stack> = mutableListOf()

    @Synchronized
    fun push() {
        if (itemsList.isEmpty())
            itemsList.add(Stack())
    }

    @Synchronized
    fun pop() {
        val removeElement = peek()
        itemsList.remove(removeElement)
    }

    @Synchronized
    fun peek() {
        if (itemsList.isEmpty()) {
            throw EmptyStackException()
        }
        itemsList.last()
    }

    fun size(): Int = itemsList.size

    fun isEmpty(): Boolean = itemsList.isEmpty()

    fun printStack() {
        for (el in itemsList) {
            print("[$el]")
        }
        println()
    }
}