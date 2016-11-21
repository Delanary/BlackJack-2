package com.company;
/**
 * Created by riybochkinfd.19 on 21.11.2016.
 */
import java.util.Collections;
import java.util.LinkedList;

public class Deck extends LinkedList<Card> {
    public Deck() {
        for (Suit s : Suit.values())
            for (Value v : Value.values()) {
                Card c = new Card(s, v);
                this.add(c);
            }
        Collections.shuffle(this);
    }
}