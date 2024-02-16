import PhoneCall.*
fun main () {
    var phonecall = PhoneCall("", "", 0.0, 0)
    var callInfo: Puple = Puple("", 0.0, "", "", 0.0, 0)
    callInfo.Input()
    callInfo.Input_20()
    callInfo.Price()
    callInfo.TotalCost()
    callInfo.Output(callInfo)
}