import Car.*
fun main () {
    var car = Car("", 0, 0.0)
    var carInfo: Shop = Shop(0.0, 0.0,0.0,0,0.0, "",  0, 0.0)
    carInfo.Input()
    carInfo.Input_()
    carInfo.Cost()
    carInfo.Output(carInfo)
}