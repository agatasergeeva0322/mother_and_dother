open class PhoneCall (var phonenumber: String,
                      var date: String,
                      var lengthOfTheCall: Double,
                      var codOfCity: Int){


    open fun Input ()
    {
        try
        {
            print("Введите номер телефона: ")
            phonenumber = readLine()!!.toString()
            print("Введите дату разговора в формате dd.mm.yyyy: ")
            date = readLine()!!.toString()
            var k = date.indexOf('.')
            var kk = date.lastIndexOf('.')
            var proverka_dd = date.toCharArray()
            if (kk-k == 3 && k-2==0) {
            if (proverka_dd[0]!!.toString()!!.toInt()>=0 && proverka_dd[0]!!.toString()!!.toInt()<=3 && proverka_dd[1]!!.toString()!!.toInt()>=0 && proverka_dd[1]!!.toString()!!.toInt()<10)
            {
                if (proverka_dd[3]!!.toString()!!.toInt()>=0 && proverka_dd[3]!!.toString()!!.toInt()<2 && proverka_dd[4]!!.toString()!!.toInt()>=0 && proverka_dd[4]!!.toString()!!.toInt()<3)
                {
                    if (proverka_dd[6]!!.toString()!!.toInt()==2 && proverka_dd[7]!!.toString()!!.toInt()==0 && proverka_dd[8]!!.toString()!!.toInt()>=0 && proverka_dd[8]!!.toString()!!.toInt()<3 && proverka_dd[9]!!.toString()!!.toInt()>=0 && proverka_dd[9]!!.toString()!!.toInt()<10)
                    {
                        if (proverka_dd[8]!!.toString()!!.toInt()==2 && proverka_dd[9]!!.toString()!!.toInt()<=4 )
                        {
                print("Продолжительность  в минутах: ")
                lengthOfTheCall = readLine()!!.toDouble()
                if (lengthOfTheCall>0) {
                    print("Код города: ")
                    codOfCity = readLine()!!.toInt()
                    if (codOfCity<0) println("Код города не может быть отрицательным")
                }
                else println("Продолжительность не может быть отрицательной")
                        }
                        else println ("Вы неправильно ввели год!")
                }
                else println("Вы неправильно ввели год!")
            }
            else println ("Вы неправильно ввели месяц!")
            }
            else println ("Вы неправильно ввели день!")
            }
            else println ("Вы неправильно ввели дату!")
        }
        catch (e : Exception)
        {
            println ("Ошибка")
        }


    }
    
    class Puple (var name : String, var cost : Double, empPhonenumber: String, empDate : String, empLengthOfTheCall : Double, empCodOfCity :Int): PhoneCall (empPhonenumber, empDate , empLengthOfTheCall , empCodOfCity)
    {

        fun Input_20(){
            print("Введите имя абонента: ")
            name = readLine()!!.toString()
        }
        var price = 0.0
        fun Price ()
        {
            if(lengthOfTheCall>0 && lengthOfTheCall<30) price = 3.23
            else price = 2.01
        }
        fun TotalCost()
        {
            cost = price*lengthOfTheCall
        }
        fun  Output (call: Puple)
        {
            println ("\nИмя aбонента: ${call.name}\nНомер телефона: ${call.phonenumber}\nДата звонка: ${call.date}\nПродолжительность разговора: ${call.lengthOfTheCall}\nКод города: ${call.codOfCity}\nОбщая стоимость звонка: ${call.cost}")
        }
    }

}
