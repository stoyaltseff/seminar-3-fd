package seminar.task03

class TravelCard(val initialTrips: Int) {
    var remainingTrips: Int = initialTrips
        private set

    init {
        require(remainingTrips > 0)
    }

    fun topUp(trips: Int) {
        require(trips >= 0)
        remainingTrips += trips
    }

    fun ride(): Boolean {
        if (remainingTrips > 0) {
            --remainingTrips
            return true
        } else {
            remainingTrips = 0
            return false
        }
    }
}
