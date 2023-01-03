import java.util.Scanner;
import java.io.*;

//Demo class for the NHLStats
public class NHLListDemo {
    public static void main(String[] args) throws IOException {

//Initializing Scanner to read in a file.
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = kb.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        NHLStats playerList = new NHLStats();

//Initializing  variables to read different data from the file and inserting it to the playerRecord constructor.
        String playerName, position, teamName;
        int gamesPlayed, goalsScored, assists, penaltyMins, shotsTaken, winningGoals;
        PlayerRecord pr;

        while (inputFile.hasNext())
        {
            playerName = inputFile.next();
            position = inputFile.next();
            teamName = inputFile.next();
            gamesPlayed = inputFile.nextInt();
            goalsScored = inputFile.nextInt();
            assists = inputFile.nextInt();
            penaltyMins = inputFile.nextInt();
            shotsTaken = inputFile.nextInt();
            winningGoals = inputFile.nextInt();

            pr = new PlayerRecord(playerName, position, teamName, gamesPlayed, goalsScored, assists, penaltyMins, shotsTaken, winningGoals);
            //Inserting players into the NHLStats list.
            playerList.addPlayer(pr);
        }

        inputFile.close();

        //Printing the required details.
        System.out.println("NHL Results Summary");
        System.out.println();
        System.out.println("Players with highest points and their teams:");
        playerList.mostPoints();
        System.out.println();
        System.out.println("Most aggressive players, their teams and their positions:");
        playerList.mostAggressive();
        System.out.println();
        System.out.println("Most valuable players and their teams:");
        playerList.mvpPlayer();
        System.out.println();
        System.out.println("Most promising players and their teams:");
        playerList.mostPromisingPlayer();
        System.out.println();
        System.out.println("Teams that had the most number of penalty minutes:");
        playerList.mostAggressiveTeam();
        System.out.println();
        System.out.println("Teams that had the most number of game winning goals:");
        playerList.mostWinningGoalsTeam();

    }
}
