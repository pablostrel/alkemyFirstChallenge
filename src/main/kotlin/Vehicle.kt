import java.util.*

data class Vehicle(
    val plate: String,
    val VehicleType: VehicleType,
    //exercise 3
    val checkInTime: Calendar = Calendar.getInstance(),
    val discountCard: String? = null
) {
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    val MINUTES_IN_MILLISECONDS = 1000

    //exercise 4
    val parkedTime: Long
        get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS


    override fun hashCode(): Int {
        return this.plate.hashCode()
    }
}