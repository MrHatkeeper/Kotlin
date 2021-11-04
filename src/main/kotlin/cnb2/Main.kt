package cnb2

fun main(){
    val input = """
        Austrálie|dolar|1|AUD|15.719
        Brazílie|real|1|BRL|4.076
        Bulharsko|lev|1|BGN|12.993
        Čína|žen-min-pi|1|CNY|3.353
        Dánsko|koruna|1|DKK|3.417
        EMU|euro|1|EUR|25.410
        Filipíny|peso|100|PHP|42.634
        Hongkong|dolar|1|HKD|2.785
        Chorvatsko|kuna|1|HRK|3.390
        Indie|rupie|100|INR|29.389
        Indonesie|rupie|1000|IDR|1.521
        Island|koruna|100|ISK|16.839
        Izrael|nový šekel|1|ILS|6.776
        Japonsko|jen|100|JPY|19.621
        Jižní Afrika|rand|1|ZAR|1.448
        Kanada|dolar|1|CAD|17.064
        Korejská republika|won|100|KRW|1.838
        Maďarsko|forint|100|HUF|7.118
        Malajsie|ringgit|1|MYR|5.177
        Mexiko|peso|1|MXN|1.075
        MMF|ZPČ|1|XDR|30.768
        Norsko|koruna|1|NOK|2.518
        Nový Zéland|dolar|1|NZD|15.228
        Polsko|zlotý|1|PLN|5.518
        Rumunsko|leu|1|RON|5.133
        Rusko|rubl|100|RUB|29.715
        Singapur|dolar|1|SGD|16.017
        Švédsko|koruna|1|SEK|2.506
        Švýcarsko|frank|1|CHF|23.459
        Thajsko|baht|100|THB|64.821
        Turecko|lira|1|TRY|2.453
        USA|dolar|1|USD|21.683
        Velká Británie|libra|1|GBP|29.649
        """.trimIndent().split("\n").toTypedArray()

    while(true){
        val inpt = readLine()!!.split(" ")

        var currencyOne = emptyArray<String>()
        var currencyTwo = emptyArray<String>()

        for (line in input) {
            val data = line.split("|").toTypedArray()
            if(inpt[1] == data[3]){
                currencyOne = data
            }
            else if(inpt[3] == data[3]){
                currencyTwo = data
            }
        }
        if(currencyOne.isEmpty() || currencyTwo.isEmpty()){
            println("něco se nepovedlo")
        }
        else {
            val output = currencyOne[4].toFloat() / currencyTwo[4].toFloat() * inpt[0].toInt()
            println(output)
        }

    }
}