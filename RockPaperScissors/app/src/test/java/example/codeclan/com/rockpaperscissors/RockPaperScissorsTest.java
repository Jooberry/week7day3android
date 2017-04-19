package example.codeclan.com.rockpaperscissors;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 19/04/2017.
 */

public class RockPaperScissorsTest {

    @Test
    public void gameSetUpTest(){
        RockPaperScissors game1 = new RockPaperScissors();
        assertEquals("Rock, Paper, Scissors", game1.getAnswers());
    }

    @Test
    public void canGetAnswerAtIndexTest(){
        RockPaperScissors game1 = new RockPaperScissors();
        assertEquals("Paper", game1.getAnswerAtIndex(1));
    }

    @Test
    public void canRandomiseListTest(){
        RockPaperScissors game1 = new RockPaperScissors();
        String result = game1.randomSelect();
        assertNotNull(result);
    };

    @Test
    public void canPlayGame(){
        RockPaperScissors game1 = new RockPaperScissors();
        System.out.println(game1.play("Rock"));
        assertNotNull(game1.play("Rock"));
    }

}
