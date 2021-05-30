import java.util.*

class Stack<T> {
    private var stack: MutableList<T> = mutableListOf()

    fun push(element: T?) {
        if (stack.size < 1) {
            if (element != null) {
                stack.add(element)
            }
        }
    }

    fun pop(): T {
        val removeElement = peek()
        stack.remove(removeElement)
        return removeElement
    }

    fun peek(): T {
        if (stack.isEmpty()) {
            throw EmptyStackException()
        }
        return stack.last()
    }

    fun size(): Int {
        return stack.size
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    fun printStack() {
        for (el in stack) {
            print("[$el]")
        }
        println()
    }
}