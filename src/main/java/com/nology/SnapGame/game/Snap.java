package com.nology.SnapGame.game;

import java.util.Scanner;

public class Snap extends CardGame {

    private final Scanner scanner = new Scanner(System.in);
    protected int card = 0;
    public Snap() {

    }

    public void playSnap() {

        while (card < 52) {
            String input = scanner.nextLine();
            String playerOne = TextInterraction.playerOne;
            if (input.isEmpty()) {
                dealCard(playDeck);
                System.out.println(playerOne + " has taken a turn.");
            }
        }
    }
}
