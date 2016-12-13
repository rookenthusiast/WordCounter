package com.example.user.wordcounter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class WordsTest {

    @Test
    public void getUserInputTest(){
        Words words = new Words();
    }

    @Test
    public void addStringToUserInput(){
        Words words = new Words();
        words.add("I'm lost and need a map");
        assertEquals("I'm lost and need a map", words.getUserInputAtIndex(0));
    }

    @Test
    public void splitUserInputToAdd(){
        Words words = new Words();
        words.userInputSplit("I think I got this");
        assertEquals(5, words.getUserInputCount());
    }
}
