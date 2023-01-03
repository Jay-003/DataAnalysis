//Player Record class.
//It stores all the information of a player.
public class PlayerRecord {

    //Instance variables
    private String playerName;
    private String position;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;
    private int penaltyMins;
    private int shotsTaken;
    private int winningGoals;

    //PlayerRecord class constructor.
    public PlayerRecord(String playerName, String position, String teamName, int gamesPlayed, int goalsScored, int assists, int penaltyMins, int shotsTaken, int winningGoals) {
        this.playerName = playerName;
        this.position = position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltyMins = penaltyMins;
        this.shotsTaken = shotsTaken;
        this.winningGoals = winningGoals;
    }

    //Getter and Setter Methods.
    public String getPlayerName() {
        return playerName;
    }

    public String getPosition() {
        return position;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getPenaltyMins() {
        return penaltyMins;
    }

    public void setPenaltyMins(int penaltyMins) {
        this.penaltyMins = penaltyMins;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public int getShotsTaken() {
        return shotsTaken;
    }

    public int getWinningGoals() {
        return winningGoals;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setShotsTaken(int shotsTaken) {
        this.shotsTaken = shotsTaken;
    }

    public void setWinningGoals(int winningGoals) {
        this.winningGoals = winningGoals;
    }

    //toString method to print the players info.
    @Override
    public String toString() {
        return "PlayerRecord{" +
                "playerName='" + playerName + '\'' +
                ", position=" + position +
                ", teamName=" + teamName +
                ", gamesPlayed=" + gamesPlayed +
                ", goalsScored=" + goalsScored +
                ", assists=" + assists +
                ", shotsTaken=" + shotsTaken +
                ", winningGoals=" + winningGoals +
                '}';
    }
}
