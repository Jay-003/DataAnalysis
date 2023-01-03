import com.sun.source.tree.BinaryTree;

import java.util.*;

//NHLStats class.
//It stores info of all the teams and its players.
public class NHLStats {

    //initializing an unordered list of type PlayerRecord
    private final LinkedList<PlayerRecord> playerRecords;

//NHLStats class constructor.
    public NHLStats() {
        playerRecords = new LinkedList<>();
    }

    /**
     * addPlayer method to add players into the unordered list.
     * @param a, info of the player to be added to the list of type PlayerRecord.
     *
     */
    public void addPlayer(PlayerRecord a) {
        playerRecords.add(a);
    }

    /**
     * Method: mostPoints()
     * This method iterate through the list to find out which player has the maximum points.
     * maximum points is sum of goals and assists by a player.
     */
    public void mostPoints() {

        int mostPoints = 0;
        String playerInfo;

        for (int i = 0; i < playerRecords.size(); i++) {
            int points = playerRecords.getAt(i).getGoalsScored() + playerRecords.getAt(i).getAssists();
            if (mostPoints < points) {
                mostPoints = points;
            }
        }

        for (int i=0; i< playerRecords.size(); i++) {
            if (mostPoints == playerRecords.getAt(i).getGoalsScored() + playerRecords.getAt(i).getAssists()) {
                playerInfo = playerRecords.getAt(i).getPlayerName() + " " + playerRecords.getAt(i).getTeamName();
                System.out.println(playerInfo);
            }
        }
    }

    /**
     * Method: mostAggressive()
     * This method iterate through the list to find out which player is most aggressive.
     * aggressiveness of a player is defined by its penalty time.
     */
    public void mostAggressive() {
        int mostAggressive = 0;
        String playerInfo;

        for (int i = 0; i < playerRecords.size(); i++) {
            if (mostAggressive < playerRecords.getAt(i).getPenaltyMins()) {
                mostAggressive = playerRecords.getAt(i).getPenaltyMins();
            }
        }

        for (int i=0; i< playerRecords.size(); i++) {
            if (mostAggressive == playerRecords.getAt(i).getPenaltyMins()) {
                playerInfo = playerRecords.getAt(i).getPlayerName() + " " + playerRecords.getAt(i).getTeamName() + " " + playerRecords.getAt(i).getPosition();
                System.out.println(playerInfo);
            }
        }
    }

    /**
     * Method: mvpPlayer()
     * This method iterate through the list to find out which player is most valuable for the team.
     * value of a player is decided by the no. of winning goals he has scored for the team.
     */
    public void mvpPlayer() {
        int mostWinGoals = 0;
        String playerInfo;

        for (int i = 0; i < playerRecords.size(); i++) {
            if (mostWinGoals < playerRecords.getAt(i).getWinningGoals()) {
                mostWinGoals = playerRecords.getAt(i).getWinningGoals();
            }
        }

        for (int i=0; i< playerRecords.size(); i++) {
            if (mostWinGoals == playerRecords.getAt(i).getWinningGoals()) {
                playerInfo = playerRecords.getAt(i).getPlayerName() + " " + playerRecords.getAt(i).getTeamName();
                System.out.println(playerInfo);
            }
        }
    }

    /**
     * Method: mostAggressive()
     * This method iterate through the list to find out which player is most promising.
     * It is decided by the no. of shots taken by a player.
     */
    public void mostPromisingPlayer() {
        int mostOnShotGoals = 0;
        String playerInfo;

        for (int i = 0; i < playerRecords.size(); i++) {
            if (mostOnShotGoals < playerRecords.getAt(i).getShotsTaken()) {
                mostOnShotGoals = playerRecords.getAt(i).getShotsTaken();
            }
        }

        for (int i=0; i< playerRecords.size(); i++) {
            if (mostOnShotGoals == playerRecords.getAt(i).getShotsTaken()) {
                playerInfo = playerRecords.getAt(i).getPlayerName() + " " + playerRecords.getAt(i).getTeamName();
                System.out.println(playerInfo);
            }
        }
    }

    /**
     * Method: mostAggressiveTeam()
     * This method iterate through the list to find out which is the most aggressive team.
     * aggressiveness of a team is defined by the sum of penalty time of all its players.
     */
    public void mostAggressiveTeam() {

        int mostAggression = 0;
        int teamAggression = 0;
        HashSet<String> teams = new HashSet<>();
        String teamInfo;

        for (int i = 0; i < playerRecords.size(); i++) {
            for (int j = 0; j < playerRecords.size(); j++) {
                if (playerRecords.getAt(i).getTeamName().equals(playerRecords.getAt(j).getTeamName())) {
                    teamAggression += playerRecords.getAt(j).getPenaltyMins();
                }
            }
            if (mostAggression < teamAggression) {
                mostAggression = teamAggression;
            }
            teamAggression=0;
        }


        for (int i = 0; i < playerRecords.size(); i++) {
            for (int j = 0; j < playerRecords.size(); j++) {
                if (playerRecords.getAt(i).getTeamName().equals(playerRecords.getAt(j).getTeamName())) {
                    teamAggression += playerRecords.getAt(j).getPenaltyMins();
                }
            }
            if(teamAggression == mostAggression) {
                teamInfo = playerRecords.getAt(i).getTeamName();
                teams.add(teamInfo);
            }
            teamAggression=0;
        }
        System.out.println(teams.toString().replace("[" ,"").replace("]" ,""));

    }

    /**
     * Method: mostWinningGoalsTeam()
     * This method iterate through the list to find out which is team has the most winning goals.
     * It is decided by calculating the sum of the winning goals hit by each player of the team.
     */
    public void mostWinningGoalsTeam() {

        int mostWinningGoals = 0;
        int teamWinningGoals = 0;
        HashSet<String> teams = new HashSet<>();
        String teamInfo;

        for (int i = 0; i < playerRecords.size(); i++) {
            for (int j = 0; j < playerRecords.size(); j++) {
                if (playerRecords.getAt(i).getTeamName().equals(playerRecords.getAt(j).getTeamName())) {
                    teamWinningGoals += playerRecords.getAt(j).getWinningGoals();
                }
            }
            if (mostWinningGoals < teamWinningGoals) {
                mostWinningGoals = teamWinningGoals;
            }
            teamWinningGoals=0;
        }
        for (int i = 0; i < playerRecords.size(); i++) {
            for (int j = 0; j < playerRecords.size(); j++) {
                if (playerRecords.getAt(i).getTeamName().equals(playerRecords.getAt(j).getTeamName())) {
                    teamWinningGoals += playerRecords.getAt(j).getWinningGoals();
                }
            }
            if (teamWinningGoals == mostWinningGoals) {
                teamInfo = playerRecords.getAt(i).getTeamName();
                teams.add(teamInfo);
            }
            teamWinningGoals = 0;
        }
        System.out.println(teams.toString().replace("[" ,"").replace("]" ,""));
    }

}
