package highScores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class HighScoreManager {

    private ArrayList<Score>    scores;
 //  private static final String fileName    = "highScores/highScores.dat"; // Toimii .jarissa, ei testeissä
    private static final String fileName     = "highScores.dat";
    ObjectOutputStream          outputStream = null;
    ObjectInputStream           inputStream  = null;

    public HighScoreManager() {
        scores = new ArrayList<Score>();
    }
    
    /**
     * Loads score file and sorts the arrayList.
     * @return sorted array of scores.
     */
    public ArrayList<Score> getScores() {
        loadScoreFile();
        sort();
        return scores;
    }
    
    private void sort() {
        ScoreComparison comparison = new ScoreComparison();
        Collections.sort(scores, comparison);
    }
    
    /**
     * Adds score to highscore file.
     * @param playerName name of player
     * @param score score achieved by player
     */
    public void addScore(String playerName, int score) {
        loadScoreFile();
        scores.add(new Score(playerName, score));
        updateScoreFile();
    }
    
    /**
     * Loads highscore file and reads scores from it.
     */
    public void loadScoreFile() {
        try {
       //   inputStream = new ObjectInputStream(getClass().getResourceAsStream("/highScores/highScores.dat")); // Tämä toimii .jarissa, alempi ei.
            inputStream = new ObjectInputStream(new FileInputStream(fileName)); // Tämä toimii netbeanssissa, ylempi ei testeissä.
            scores = (ArrayList<Score>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("IO Error: " + e.getMessage());
            }
        }
    }
    
    /**
     * Writes new array of scores to highscore file.
     */
    public void updateScoreFile() {
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(scores);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Update Error: " + e.getMessage());
            }
        }
    }

    /**
     * Shows Top 5 highscores as Strings
     * @return String of top 5
     */
    public String getHighscoreString() {
        String highscoreToString = "";
	int maxScoresShown = 5;

        ArrayList<Score> scores;
        scores = getScores();

        int i = 0;
        int x = scores.size();
        if (x > maxScoresShown) {
            x = maxScoresShown;
        }
        while (i < x) {
            highscoreToString += (i + 1) + ". " + scores.get(i).getPlayerName() + "\t\t" + scores.get(i).getScore() + "\n";
            i++;
        }
        return highscoreToString;
    }
    
    /**
     * @param rank wanted highscore position 
     * @return prints highscore from position shown by parameter.
     * Adjusts a 0 to beginning of position 1-9 for sexier layout.
     */
    public String getHighscoreString(int rank) {
        String highscoreToString = "";
        ArrayList<Score> scores;
        scores = getScores();
        rank--;       
            if(scores.get(rank).getScore() < 10) {
                highscoreToString += (rank+1) + ". [0" + scores.get(rank).getScore() + "] - " + scores.get(rank).getPlayerName();           
            } else {
                highscoreToString += (rank+1) + ". ["  + scores.get(rank).getScore() + "] - " + scores.get(rank).getPlayerName();
            }       
        return highscoreToString;        
    }
    
    /**
     * Checks if parameter is within the top 10 of the highscore file.
     * @param score to be checked
     * @return true if is highscore, false if is not.
     */
    public boolean isHighScore(int score) {
	int maxScoresShown = 10;

        ArrayList<Score> scores;
        scores = getScores();
        
        int x = scores.size();
        if (x > maxScoresShown) {
            x = maxScoresShown;
        }
        for(int i = 0; i < x; i++) {
            if (score > scores.get(i).getScore()) {
                return true;
            }          
        }
        return false;
    }
}

