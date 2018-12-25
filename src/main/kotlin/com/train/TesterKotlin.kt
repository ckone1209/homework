package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var ticketAmount = scanner.nextInt()
    println("How many round-trip tickets: ")
    var roundTripTicketAmount = scanner.nextInt()

    val ticket = TicketKotlin(ticketAmount, roundTripTicketAmount)
    ticket.showResult()
}