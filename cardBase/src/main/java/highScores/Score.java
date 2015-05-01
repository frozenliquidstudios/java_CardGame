package highScores;

import java.io.Serializable;

public class Score implements Serializable {
    private int score;
    private String playerName;

    public Score(String playerName, int score) {
        this.score = score;
        this.playerName = playerName;
    }    

    public int getScore() {
        return score;
    }

    public String getPlayerName() {
        return playerName;
    }
}
