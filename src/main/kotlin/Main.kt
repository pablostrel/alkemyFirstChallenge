import java.util.*

fun main() {
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("BB22BBB", VehicleType.MOTORBIKE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")

    val parking = Parking(mutableSetOf(car, moto, minibus, bus,))

    //println(parking.vehicles.contains(car))
    //println(parking.vehicles.contains(moto))
    //println(parking.vehicles.contains(minibus))
    //println(parking.vehicles.contains(bus))


    val listOfVehicles = listOf(
        Vehicle("AA222AA", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("BB222BB", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("CC333CC", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("DD444DD", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("EE555EE", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("FF666FF", VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_003"),
        Vehicle("GG777GG", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("HH888HH", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("II999II", VehicleType.MOTORBIKE, Calendar.getInstance(), "DISCOUNT_CARD_004"),
        Vehicle("JJ111JJ", VehicleType.MINIBUS, Calendar.getInstance()),
        Vehicle("KK111KK", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("LL222LL", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("MM333MM", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("NN444NN", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("OO555OO", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("PP666PP", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_005"),
        Vehicle("QQ777QQ", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("RR888RR", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("SS999SS", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_CARD_006"),
        Vehicle("TTTTTTT", VehicleType.CAR, Calendar.getInstance()),
    ) //20


    listOfVehicles.map{
        println(parking.addVehicle(it))
    }

    println("\n")
    println(parking.checkOutVehicle("AA222AA"))
    println(parking.checkOutVehicle("GG777GG"))
    println(parking.checkOutVehicle("FFFFFFF"))
    println(parking.checkOutVehicle("PP666PP"))
    println(parking.checkOutVehicle("SS999SS"))
    println("-------------")
    println("\n")
    println(parking.listVehicles())
    println("\n")

    println(parking.resumeParking())

    println("\n")
    println(parking.listVehicles())
}