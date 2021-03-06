package edu.wctc;

import java.util.ArrayList;
import java.util.List;

/**
 * The Deck class is a list of cards.
 * @author Zach Huba
 */

public class Deck
{
    List<Card> deck = new ArrayList<>();

    public Deck()
    {
        deck.add(new Card("Two", "Heart", 2));
        deck.add(new Card("Three", "Heart", 3));
        deck.add(new Card("Four", "Heart", 4));
        deck.add(new Card("Five", "Heart", 5));
        deck.add(new Card("Six", "Heart", 6));
        deck.add(new Card("Seven", "Heart", 7));
        deck.add(new Card("Eight", "Heart", 8));
        deck.add(new Card("Nine", "Heart", 9));
        deck.add(new Card("Ten", "Heart", 10));
        deck.add(new Card("Jack", "Heart", 11));
        deck.add(new Card("Queen", "Heart", 12));
        deck.add(new Card("King", "Heart", 13));
        deck.add(new Card("Ace", "Heart", 14));
        deck.add(new Card("Two", "Spade", 2));
        deck.add(new Card("Two", "Club", 2));
        deck.add(new Card("Two", "Diamond", 2));
    }

    public Card getCard(int i)
    {
        return deck.get(i);
    }

}
