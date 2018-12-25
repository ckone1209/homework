package com.train;

public class Ticket {
    int price = 1000;
    int amount = 0;

    int roundTripTicketPrice = (int) (2000*0.9);
    int roundTripTicketAmount = 0;

    public Ticket(int amount, int roundTripTicketAmount) {
        this.amount = amount;
        this.roundTripTicketAmount = roundTripTicketAmount;
    }

    public int getTotalPrice() {
        return (amount-roundTripTicketAmount)*price + roundTripTicketAmount*roundTripTicketPrice;
    }

    public void showResult() {
        System.out.println("Total tickets: " + amount);
        System.out.println("Round-trip: " + roundTripTicketAmount);
        System.out.println("Total: " + getTotalPrice());
    }
}
