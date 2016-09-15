//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Card player1 = new Card(10, -1);
    Card player2 = new Card(13, 4);
    System.out.print(player1);
    System.out.print(player2);
    System.out.println(Card.rankToString(13));
    Deck deck0 = new Deck();
    System.out.println(deck0.getCard(2, 2));
    
    Deck deck = new Deck();
    for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
      for (int rank = Card.ACE; rank <= Card.KING; rank++) {
        Card card = deck.getCard(suit, rank);
        System.out.format("%s of %s%n",
                          card.rankToString(card.getRank()),
                          card.suitToString(card.getSuit()));
      }
    }
    
  }
}

// you can add other public classes to this editor in any order
public class Card
{
  private final int rank;
  private final int suit;
  // Kinds of suits
  public final static int DIAMONDS = 1;
  public final static int CLUBS = 2;
  public final static int HEARTS = 3;
  public final static int SPADES = 4;
  // Kinds of ranks
  public final static int ACE   = 1;
  public final static int DEUCE = 2;
  public final static int THREE = 3;
  public final static int FOUR  = 4;
  public final static int FIVE  = 5;
  public final static int SIX   = 6;
  public final static int SEVEN = 7;
  public final static int EIGHT = 8;
  public final static int NINE  = 9;
  public final static int TEN   = 10;
  public final static int JACK  = 11;
  public final static int QUEEN = 12;
  public final static int KING  = 13;
    
  public Card(int rank, int suit)
  {
     assert isValidRank(rank);
     assert isValidSuit(suit);
     this.rank = rank;
     this.suit = suit;
  }
  
  public static boolean isValidRank(int rank)
  {
    return rank >= ACE && rank <= KING;
  }

  public static boolean isValidSuit(int suit)
  {
    return suit >= DIAMONDS && suit <= SPADES;
  }
  
  public int getRank()
  {
    return rank;
  }
  
  public int getSuit()
  {
    return suit;
  }
  
  public static String rankToString(int rank)
  {
    switch (rank) 
    {
      case ACE: return "Ace";
      case DEUCE: return "Deuce";
      case THREE: return "Three";
        case FOUR: return "Four";
        case FIVE: return "Five";
        case SIX: return "Six";
        case SEVEN: return "Seven";
        case EIGHT: return "Eight";
        case NINE: return "Nine";
        case TEN: return "Ten";
        case JACK: return "Jack";
        case QUEEN: return "Queen";
        case KING: return "King";
      default: return null;
      
    }
      
  }
  
    public static String suitToString(int suit) 
    {
        switch (suit) {
        case DIAMONDS: return "Diamonds";
        case CLUBS:    return "Clubs";
        case HEARTS:   return "Hearts";
        case SPADES:   return "Spades";
        default:       return null;
        }    
    }
  
  public String toString()
  {
    return "suit=" + suitToString(suit) + ", rank=" + rankToString(rank);
  }

}

public class Deck
{
  public static int numSuits = 4;
  public static int numRanks = 13;
  public static int numCards = numSuits * numRanks;
  private Card[][] cards;
  public Deck()
  {
    cards = new Card [numSuits][numRanks];
    for (int s = Card.DIAMONDS; s<= Card.SPADES; s++)
      for (int r = Card.ACE; r<= Card.KING; r++)
        cards[s-1][r-1] = new Card(r, s);
  }
  
  public Card getCard(int suit, int rank) 
  {
     return cards[suit-1][rank-1];
  }
}


public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    card.rankToString(card.getRank()),
                    card.suitToString(card.getSuit()));
            }
        }
    }
}
