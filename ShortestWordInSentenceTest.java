import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordInSentenceTest {

    @Test
    public void returnLengthOfShortestWord(){
        String sentence = "I am a girl";
        assertEquals("I",ShortestWordInSentence.findShortestWord(sentence));
    }

    @Test
    public void returnLengthOfShortestWordTwo(){
        String sentence = "We are Africans";
        assertEquals("We",ShortestWordInSentence.findShortestWord(sentence));
    }

    @Test
    public void returnLengthOfShortestWordThree(){
        String sentence = "The world is wicked";
        assertEquals("is",ShortestWordInSentence.findShortestWord(sentence));
    }

    @Test
    public void returnLengthOfShortestWordFour(){
        String sentence = ".. Horizon";
        assertEquals("Horizon",ShortestWordInSentence.findShortestWord(sentence));
    }
}
