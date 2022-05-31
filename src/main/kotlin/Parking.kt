data class Parking(val vehicles: MutableSet<Vehicle>): Parkable(vehicles)  {

    //exercise 11
    private val maxParkingSpace: Int = 20
    private val data : Pair<Int, Int> = Pair(profits, totalParkedVehicle)
    //exercise 5
    fun addVehicle(vehicle: Vehicle): String {
        return when (maxParkingSpace - vehicles.size) {
            in 1..maxParkingSpace -> {
                vehicles.add(vehicle)
                "Welcome to AlkeParking"
            }
            else -> "Sorry, the check-in failed"
        }
    }

    fun listVehicles(){
        println("Vehicles in the parking:")
        vehicles.forEach { println(it.plate)
        }
    }
    fun resumeParking(){
        println("---Resume Parking---")
        println("Total profits: $profits")
        println("Total Vehicles Parked: $totalParkedVehicle")
    }
}