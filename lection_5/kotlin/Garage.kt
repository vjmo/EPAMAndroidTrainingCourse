class Garage<T : Transport> {
    private val transportMutableList: MutableList<T> = mutableListOf()

    fun addTransport(transport: T) = transportMutableList.add(transport)

    fun removeTransport(transport: T) = transportMutableList.remove(transport)

    fun getTransport(): List<Transport> = transportMutableList.toList()

    fun printTransportList() = println(getTransport())
}