package com.nology.SnapGame.game;

public class Card {

    // Has a String suit. Use unicode for suit characters. (Hearts, Clubs, Diamonds, Spades.)
    // Has a String symbol. (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)
    //Has an int value (2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    private final String suit;
    private final String symbol;
    private final int value;

    //Card method constructor.
    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    //getters (value, suit, symbol)
    public int getValue() {
        return value;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getSuit() {
        return suit;
    }

    //toString method class description
    @Override
    public String toString() {
        return (symbol + suit);
    }

}
