package edu.wctc;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The Poker class contains all the methods used to determine whether a hand meets certain criteria.
 * @author Zach Huba
 */

public class Poker
{
    public boolean isStraight(List<Card> hand)
    {
        boolean isTheHand = true;
        int previousScore = 0;
        int score = 0;

        for (int i = 0; i < 5; i++)
        {
            Card card = hand.get(i);
            score = card.getScore();
            if((score != previousScore + 1) && (i != 0)) isTheHand = false;
            previousScore = score;
        }
        return isTheHand;
    }

    public boolean isStraightFlush(List<Card> hand)
    {
        boolean isTheHand = true;
        int previousScore = 0;
        String previousSuit = "";
        String suit = "";
        int score = 0;

        for (int i = 0; i < 5; i++)
        {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();
            if (((score != previousScore+1) && (i != 0)) || ((!suit.equalsIgnoreCase(previousSuit)) && (i != 0))) isTheHand = false;
            previousScore = score;
            previousSuit = suit;
        }
        return isTheHand;
    }

    public String highCard(List<Card> hand)
    {
        List<Integer> cardVals = new ArrayList<>();
        for (Card card : hand)
        {
            cardVals.add(card.getScore());
        }
        Collections.sort(cardVals);
        List<Integer> sortedNums = new ArrayList<>(cardVals);
        return "The high card is " + sortedNums.get(sortedNums.size() - 1);
    }

    public boolean isRoyalFlush(List<Card> hand)
    {
        boolean isTheHand = true;
        int neededScore = 60;
        int total = 0;
        String neededSuit = "Heart";
        String suit = "";
        for (Card card : hand)
        {
            total += card.getScore();
        }
        if(total != neededScore)
        {
            isTheHand = false;
        }
        for(int i = 0; i < 5; i++)
        {
            Card card = hand.get(i);
            suit = card.getSuit();
            if(!suit.equalsIgnoreCase(neededSuit) && (i != 0))
            {
                isTheHand = false;
            }
        }
        return isTheHand;
    }

    public boolean isFourOfAkind(List<Card> hand)
    {
        boolean isHand = true;
        List<Integer> cardVals = new ArrayList<>();
        for (Card card : hand)
        {
            cardVals.add(card.getScore());
        }
        Collections.sort(cardVals);
        List<Integer> sortedNums = new ArrayList<>(cardVals);
        if(sortedNums.get(sortedNums.size() - 2) != sortedNums.get(sortedNums.size() - 3) || sortedNums.get(sortedNums.size() - 3) != sortedNums.get(sortedNums.size() - 4))
        {
            isHand = false;
        }
        return isHand;
    }
}
