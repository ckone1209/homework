package com.train

class TicketKotlin(var amount: Int, var roundTripTicketAmount: Int) {
    val price = 1000;
    val roundTripTicketPrice = 2000*0.9

    fun getTotalPrice(): Int {
        return ((amount-roundTripTicketAmount)*price +
                roundTripTicketAmount*roundTripTicketPrice).toInt()
    }

    fun showResult() {
        println("Total tickets: " + amount)
        println("Round-trip: " + roundTripTicketAmount)
        println("Total: " + getTotalPrice())
    }
}