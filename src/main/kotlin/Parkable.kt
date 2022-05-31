import java.lang.Math.ceil


open class Parkable(private val vehicle: MutableSet<Vehicle>){
    var profits: Int = 0
    var totalParkedVehicle: Int = 0

    fun checkOutVehicle(plate: String): String{
        val parkedVehicle = vehicle.filter{it.plate==plate}
        if(parkedVehicle.isNotEmpty()){
            val vehicleCheck = parkedVehicle[0]
            var parkingValue = calculateFee(vehicleCheck.VehicleType,vehicleCheck.parkedTime.toDouble())
            //exercise 9
            if(vehicleCheck.discountCard != null){
                parkingValue <= (parkingValue * 0.15).toInt()
            }
            //exercise 7
            vehicle.remove(vehicleCheck)
            totalParkedVehicle++
            profits += parkingValue
            return onSuccess(parkingValue)
        }
        return onError()
    }

    //exercise 8
    private fun calculateFee(type: VehicleType, parkedTime: Double): Int{
        val rate: Int
        return when{
            parkedTime <= 120 -> type.price
            else -> {
                rate = ceil((((parkedTime - 120)/15))).toInt() * 5
                type.price + rate
            }
        }
    }
}
    private fun onError ():String{
        return "Sorry, the check-out failed"
    }

    private fun onSuccess(parkingValue: Int): String{
        return "Your fee is $parkingValue. Come back soon!"
    }