package com.nology.SnapGame.game;

import java.util.ArrayList;

public class CardGame {

    private final String[] symbol = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] value = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private static final String[] suit = new String[] {"\uD83D\uDD36", "\u2664", "\uD83E\uDDE1", "\u2667"};

    //Contains an ArrayList<Card> that contains all 52 cards within a "deck" which is populated when the game is constructed.
    public static ArrayList<Card> deck = new ArrayList<>();
    public static ArrayList<Card> playDeck = new ArrayList<>();

    //Has a name which is also defined in the constructor.
    public CardGame() {
        for (int i = 0; i < suit.length; i++) {
            for (int i1 = 0; i1 < symbol.length; i1++) {
                deck.add(new Card( symbol[i1], suit[i], value[i1] ));
            }
        }
        System.out.println(deck);
//        System.out.println(deck.size());
    }

    //getDeck method to list out the cards in the deck.
    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card dealCard() {
        Card inPlay = deck.get(0);
        playDeck.add(inPlay);
        System.out.println(playDeck);
        return inPlay;
    }

    public static void main(String[] args) {

        TextInterraction textInterraction = new TextInterraction();
        System.out.println(textInterraction.welcome() );

        CardGame cards = new CardGame();
        System.out.println(cards.dealCard());

    }

}
