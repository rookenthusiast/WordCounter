package com.example.user.wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 13/12/2016.
 */
public class Words{

    private ArrayList<String> userInput;

    public Words() {
        userInput = new ArrayList<String>();
    }

    public Words(ArrayList<String> userInput){
        this.userInput = new ArrayList<String>(userInput);
    }

    public ArrayList<String> getUserInput() { return new ArrayList<String>(this.userInput);}

    public void add(String sentence) {
        userInput.add(sentence);
    }

    public int getUserInputCount(){
        return userInput.size();
    }

    public String getUserInputAtIndex(int index){
        return userInput.get(index);
    }

    public void userInputSplit(String sentence){
        String[] splitWords = sentence.split(" ");
        for (String word : splitWords){
            userInput.add(word);
        }
    }
}
