open class Car (var name: String,
                var power: Int,
                var price: Double){
    open fun Input ()
    {
        try
        {
            print("Введите марку машины: ")
            name = readLine()!!.toString()
            print("Введите мощность машины: ")
            power = readLine()!!.toInt()
            if (power>0) {
                if (power>50)
                {
                print("Введите стоимость машины (в рубля, пожалуйста): ")
                price = readLine()!!.toDouble()
                if (price>0)
                {
                    if (price>=500000)
                    else println ("Слишком дёшево. Мошенничеством пахнет")
                }
                    else println("Цена не может быть отрицательной")
                }
                else println ("Мощность не может быть такой маленькой")
            }
            else println ("Мошность не может быть отрицательной")

        }
        catch (e : Exception)
        {
            println ("Ошибка")
        }
    }

    class Shop ( var pup_year : Double, var cost : Double, var count : Int, var totalcost : Double, empName: String, empPower : Int, empPrice : Double): Car (empName, empPower, empPrice)
    {

        fun Input_(){
            print("Введите сколько лет вы закупаете у нас машины (в годах, пожалуйста): ")
            pup_year = readLine()!!.toDouble()
            if (pup_year>0) {
                print("Введите количество, которое вы бы хотели приобрести: ")
                count = readLine()!!.toInt()
                if (count>0)
                    else println("Количество не может быть отрицательным!")
            }
            else println("Годы не могут быть отрицаельными!")
        }
        fun Cost()
        {
            if (pup_year > 10)  cost = (price/100)*90
            else cost = price
            totalcost = cost * count
        }
        fun  Output (car: Shop)
        {
            println ("\nМарка: ${car.name}\nМощность: ${car.power}\nСтоимость 1-й машины для вас: ${car.cost} руб.\n" +
                    "Общая стоимость покупки: ${car.totalcost} руб.\nСПАСИБО, ЧТО ВЫБРАЛИ НАШУ КОМПАНИЮ!!!")
        }
    }
}
