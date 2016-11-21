package com.company;
/**
 * Created by riybochkinfd.19 on 21.11.2016.
 */
public class Dealer extends Computer {
    Deck deck = new Deck();

    public void deal(Player player) {
        Card current = deck.pop();
        player.take(current);
    }
}