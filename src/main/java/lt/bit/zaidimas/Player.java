package lt.bit.zaidimas;

public class Player {
    private final String playerName;
    private String playerChoose;
    private String computerChoose;
    private String lastGame;
    private int wins;
    private int loses;
    private int draw;

    public Player(String playerName) {
        this.playerName = playerName;
        this.wins = 0;
        this.loses = 0;
        this.draw = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getLastGame() {
        return lastGame;
    }

    public void setLastGame(String lastGame) {
        this.lastGame = lastGame;
    }

    public String getPlayerChoose() {
        return playerChoose;
    }

    public void setPlayerChoose(String playerChoose) {
        this.playerChoose = playerChoose;
    }

    public String getComputerChoose() {
        return computerChoose;
    }

    public void setComputerChoose(String computerChoose) {
        this.computerChoose = computerChoose;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerChoose='" + playerChoose + '\'' +
                ", computerChoose='" + computerChoose + '\'' +
                ", lastGame='" + lastGame + '\'' +
                ", wins=" + wins +
                ", loses=" + loses +
                ", draw=" + draw +
                '}';
    }
}
