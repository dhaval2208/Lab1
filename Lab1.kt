// Student id :- #A00255187
// Student Name :- Bhimani Dhavalkumar Zaverbhai
// JAV-1001 - 50733 - App Development for Android - 202205 - 001

fun main() {
    println("whould you like to convert different forms select one number and enter value:")

    println("1 .  kilometer to mile")
    println("2 .  mile to kilometer")
    println("3 .  centimeter to inch")
    println("4 .  inch to centimeter")
    println("5 .  Kilogram to Pound")
    println("6 .  Pound to Kilogram")
    println("7 .  Gram to Ounce")
    println("8 .  Ounce to Gram")
    println("9 .  Celsius to Fahrenheit")
    println("10 .  Fehrenhit to celsius")
    println("11 .  Celsius to Kelvin")
    println("12 .  Fehrenhit to Kelvin")
    println("13 .  Liter to cups")
    println("14 .  Cups to Liter")


    println("Please enter a option")
    val option = readln() . toInt()

    if (option > 14){
        println("ENTER valid option")
}
else {
        println("Please enter a value =  ")
    val  value  =  readln().toDouble()




    when (option) {
        1 -> println(value.toString() + " kilometer is equle to " + (value / 1.609).toString() + " mile")
        2 -> println(value.toString() + " mile is equle to " + (value * 1.609).toString() + " kilometer")
        3 -> println(value.toString() + " centimeter is equle to " + (value / 2.54).toString() + " inches")
        4 -> println(value.toString() + " inches is equle to " + (value * 2.54).toString() + " centimeter")
        5 -> println(value.toString() + " Kilogram  is equle to " + (value * 2.205).toString() + " Pound")
        6 -> println(value.toString()+ " Pound is equle to " + (value / 2.205).toString() + " Kilogram")
        7 -> println(value.toString() + " Gram is equle to " + (value / 28.35).toString() + " Ounce")
        8 -> println(value.toString() + " Ounce is equle to " + (value * 28.35).toString() + " Gram")
        9 -> println(value.toString() + " Celsius is equle to " + ((value * 9 / 5) + 32).toString() + " Fahreheit")
        10 -> println(value.toString() + " Fahreheit is equle to " + ((value - 32) * 5 / 9).toString() + " Celsius")
        11 -> println(value.toString() + " Celsius is equle to " + (value + 273.15).toString() + " Kelvin")
        12 -> println(value.toString() + " Fahreheit is equle to " + ((value - 32) * 5 / 9 + 273.15).toString()  + " Kelvin")
        13 -> println(value.toString() + " Liter is equle to " + (value * 4.227).toString() + " Cups")
        14 -> println(value.toString() + " Cups is equle to " + (value / 4.227).toString() + " Liter")



    }
}
}
