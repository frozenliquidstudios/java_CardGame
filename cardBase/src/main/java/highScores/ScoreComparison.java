package highScores;

import java.util.Comparator;

public class ScoreComparison implements Comparator<Score> {

    @Override
    public int compare(Score score1, Score score2) {
        int scoreOne = score1.getScore();
        int scoreTwo = score2.getScore();
    
    if (scoreOne > scoreTwo){
                return -1;
            }else if (scoreOne < scoreTwo){
                return +1;
            }else{
                return 0;
            }
    }   
}

