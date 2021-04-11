package edu.wctc.test;

import edu.wctc.Card;
import edu.wctc.Deck;
import edu.wctc.Poker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The PokerTest class implements JUnit tests for all the Poker class methods.
 * @author Zach Huba
 */

class PokerTest
{
    Deck deck = new Deck();
    List<Card> hand = new ArrayList<Card>();
    Poker poker = new Poker();

    @BeforeEach
    void runIt() {
        hand.add(deck.getCard(8));
        hand.add(deck.getCard(9));
        hand.add(deck.getCard(10));
        hand.add(deck.getCard(11));
        hand.add(deck.getCard(12));
    }
    @org.junit.jupiter.api.Test
    void isStraight() {
        assertTrue(poker.isStraight(hand));
    }

    @org.junit.jupiter.api.Test
    void isStraightFlush() {
        assertTrue(poker.isStraightFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void HighCard() {assertAll(poker.highCard(hand));}

    @org.junit.jupiter.api.Test
    void isRoyalFlush() {
        assertTrue(poker.isRoyalFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void isFourOfAKind() {
        assertTrue(poker.isFourOfAkind(hand));
    }
}
