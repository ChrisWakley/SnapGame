package com.nology.SnapGame.game;

import java.util.Scanner;

import static com.nology.SnapGame.game.TextInterraction.nameOne;

public class Snap extends CardGame {

    private final Scanner scanner = new Scanner(System.in);
    protected int card = 0;
    public Snap() {

    }

    public void playSnap() {

        while (card < 52) {
            shuffleDeck();
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                dealCard();

                System.out.println(nameOne + " has taken a turn.");
            }
        }
    }

}
