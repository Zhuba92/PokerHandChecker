package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Deck deck = new Deck();
        List<Card> hand = new ArrayList<>();
        Poker poker = new Poker();

        List<Card> hand2 = new ArrayList<>();
        hand2.add(deck.getCard(1));
        hand2.add(deck.getCard(13)); // 13
        hand2.add(deck.getCard(14)); // 14
        hand2.add(deck.getCard(15)); // 15
        hand2.add(deck.getCard(0));  // 0

        hand.add(deck.getCard(8));
        hand.add(deck.getCard(9));
        hand.add(deck.getCard(10));
        hand.add(deck.getCard(11));
        hand.add(deck.getCard(12));

        for (Card card : hand)
        {
            System.out.println(card);
        }

        System.out.println(poker.isStraight(hand));
        System.out.println(poker.isStraightFlush(hand));
        System.out.println(poker.highCard(hand));
        System.out.println(poker.isRoyalFlush(hand));
        System.out.println(poker.isFourOfAkind(hand2));
    }
}
