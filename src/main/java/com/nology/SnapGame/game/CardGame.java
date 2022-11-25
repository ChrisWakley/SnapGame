package com.nology.SnapGame.game;

import java.util.*;

public class CardGame {

    private final String[] symbol = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] value = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private static final String[] suitCode = new String[] {"\uD83D\uDD36", "\u2664", "\uD83E\uDDE1", "\u2667"};
    private static final String[] suit = new String[] {"diamonds", "clubs", "hearts", "spades" };

    //Contains an ArrayList<Card> that contains all 52 cards within a "deck" which is populated when the game is constructed.
    public static ArrayList<Card> deck = new ArrayList<>();
    public static ArrayList<Card> playDeck = new ArrayList<>();

    //Has a name which is also defined in the constructor.
    public CardGame() {
        for (int i = 0; i < suitCode.length; i++) {
            for (int i1 = 0; i1 < symbol.length; i1++) {
                deck.add(new Card(  suitCode[i], suit[i], symbol[i1], value[i1] ));
            }
        }
//        System.out.println(deck);
//        System.out.println(deck.size());
    }

    //getDeck method to list out the cards in the deck.
    public ArrayList<Card> getDeck(ArrayList<Card> deck) {
        return CardGame.deck;
    }

    //dealCard method to allow players to draw a card.
    public Card dealCard(ArrayList<Card> playDeck) {
        Card inPlay = deck.get(0);
        CardGame.playDeck.add(inPlay);
        CardGame.deck.remove(inPlay);
        System.out.println(CardGame.playDeck);
        return inPlay;
    }

    //shuffleDeck method to randomise the deck (shuffle the deck)
    public ArrayList<Card> shuffleDeck(ArrayList<Card> deck) {
        Collections.shuffle(deck);
        System.out.println(deck);
        return deck;
    }

    //method to sort the deck by value (face value of cards in order)
    public ArrayList<Card> sortDeckByValue(ArrayList<Card> deck) {
        deck.sort(Comparator.comparing(Card::getValue));
        return deck;
    }

    //method to sort the deck by suit (suit of cards)
    public ArrayList<Card> sortDeckBySuit(ArrayList<Card> deck) {
        deck.sort(Comparator.comparing(Card::getSuit));
        return deck;
    }

    public static void main(String[] args) {

        TextInterraction textInterraction = new TextInterraction();
        System.out.println(textInterraction.welcome() );

        CardGame cards = new CardGame();

        cards.shuffleDeck(deck);
        System.out.println(playDeck);

        Snap snap = new Snap();
        snap.playSnap();

    }

}
