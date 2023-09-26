/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Random rnd = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            int randValue = rnd.nextInt(13) + 1;
            c.setValue(randValue);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int randSuit = rnd.nextInt(4);
            c.setSuit(Card.SUITS[randSuit]);
            magicHand[i] = c;
           

        }
        //insert code to ask the user for Card value and suit, create their card

        Card userGuess = new Card();
        System.out.print("Please pick a card, any card from a deck of 52!");
        Scanner inp = new Scanner(System.in);

        userGuess.setValue(inp.nextInt());
        userGuess.setSuit(inp.nextLine());
        String userGuessString = userGuess.getSuit();
        
        //Removing any spaces that would hinder my search
        userGuessString = userGuessString.trim();
        // and search magicHand here
        int flag = 0;
        for (int i = 0; i < magicHand.length; i++) {
            String temporarySuit = magicHand[i].getSuit();
            
            if ((magicHand[i].getValue() == userGuess.getValue()) &&(temporarySuit.equalsIgnoreCase(userGuessString))) {

                flag = 1;
 

            }
        }

        //Then report the result here
        if (flag == 1) {
            System.out.println("You won! You're good at this!");
        } else if (flag == 0) {
            System.out.println("You lost.Just a little more practise you'll be a pro!");
        }
        // add one luckcard hard code 2,clubs

    }
}
