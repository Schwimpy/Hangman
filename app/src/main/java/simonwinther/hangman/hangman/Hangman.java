package simonwinther.hangman.hangman;

import java.util.Random;

/**
 * Created by simonwinther on 25/10/17.
 */

public class Hangman {

    private String[] listWords;
    private String mysteryWord;
    private char[] guess;

    public Hangman() {

        listWords = new String[10];
        listWords[0] = "centrifug";
        listWords[1] = "kabelsnurra";
        listWords[2] = "kappsejsa";
        listWords[3] = "danmarksbåten";
        listWords[4] = "ithsdistans";
        listWords[5] = "hemlighetenskammare";
        listWords[6] = "dieselturbo";
        listWords[7] = "montypython";
        listWords[8] = "halvspecial";
        listWords[9] = "thelegomovie";

        Random rand = new Random();
        int arraySpot = rand.nextInt(10);
        mysteryWord = listWords[arraySpot];

        guess = new char[mysteryWord.length()];
        for (int p = 0; p < mysteryWord.length(); p++ ) {
            guess[p] = '-';
        }
    }

    public boolean makeGuess(char playerguess) {
        boolean hit = false;

        for (int i = 0; i < mysteryWord.length(); i++) {
            if (playerguess == mysteryWord.charAt(i)) {
                guess[i] = playerguess;
                hit = true;
            }
        }
        return hit;
    }

    public String getMaskedWord() {
        return String.valueOf(guess);
    }
    }

