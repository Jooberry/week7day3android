package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 19/04/2017.
 */

public class RockPaperScissors {
    private String[] selections = new String[]{"Rock", "Paper", "Scissors"};

    public RockPaperScissors(){
    };

    public String getAnswers(){
        String result = selections[0] + ", "+ selections[1] +", "+ selections[2];
        return result;
    };

    public String play(String playerSelection){
        String compSelection = randomSelect();
        if (playerSelection == compSelection)
            return "The Computer Matched Your Selection! Draw!";
        if (playerSelection == "Rock"){
            if (compSelection == "Scissors") {
                return "Computer Selected Scissors. Rock breaks Scissors. You Win!";
            }
            if (compSelection == "Spock") {
                return "Computer Selected Spock. Spock blasts rock. You Lose!";
            }
            if (compSelection == "Lizard") {
                return "Computer Selected Lizard. Rock kills lizard. You Win!";
            }
            else {
                return "Computer Selected Paper. Paper covers rock. You Lose!";
            }
        }
        if (playerSelection == "Paper"){
            if (compSelection == "Rock") {
                return "Computer Selected Rock. Paper covers rock. You Win!";
            }
            if (compSelection == "Spock") {
                return "Computer Selected Spock. Paper disproves Spock. You Win!";
            }
            if (compSelection == "Lizard") {
                return "Computer Selected Lizard. Lizard eats paper. You Lose!";
            }
            else {
                return "Computer Selected Scissors. Scissors cut paper. You Lose!";
            }
        }
        if (playerSelection == "Rock"){
            if (compSelection == "Scissors") {
                return "Computer Selected Scissors. Rock breaks scissors. You Win!";
            }
            if (compSelection == "Spock") {
                return "Computer Selected Spock. Spock blasts rock. You Lose!";
            }
            if (compSelection == "Scissors") {
                return "Computer Selected Lizard. Scissors decapitate lizard. You Win!";
            }
            else {
                return "Computer Selected Paper. Paper covers rock. You Lose!";
            }
        }
        if (playerSelection == "Spock"){
            if (compSelection == "Scissors") {
                return "Computer Selected Scissors. Spock snaps scissors. You Win!";
            }
            if (compSelection == "Rock") {
                return "Computer Selected Rock. Spock blasts rock. You Win!";
            }
            if (compSelection == "Lizard") {
                return "Computer Selected Lizard. Lizard poisons Spock. You Lose!";
            }
            else {
                return "Computer Selected Paper. Paper disproves Spock. You Lose!";
            }
        }
        if (playerSelection == "Lizard"){
            if (compSelection == "Scissors") {
                return "Computer Selected Scissors. Scissors decapitate lizard. You Lose!";
            }
            if (compSelection == "Spock") {
                return "Computer Selected Spock. Lizard poisons Spock. You Win!";
            }
            if (compSelection == "Rock") {
                return "Computer Selected Rock. Rock kills lizard. You Lose!";
            }
            else {
                return "Computer Selected Paper. Lizard eats paper. You Win!";
            }
        }
        return null;
    }

    public String randomSelect(){
        Random rand = new Random();
        int index = rand.nextInt(3);
        String answer = getAnswerAtIndex(index);
        return answer;
    };

    public String getAnswerAtIndex(int index){
        return selections[index];
    };
}
