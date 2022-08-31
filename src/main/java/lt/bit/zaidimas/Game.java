package lt.bit.zaidimas;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private final static Map<String, Player> players = new HashMap<>();
    private final static Map<String,String> zaidimoLenetele = new HashMap<>() {{
        put("ROCKPAPPER", "LOSE");
        put("ROCKSISSORS", "WIN");
        put("ROCKROCK", "DRAW");
        put("PAPPERROCK", "WIN");
        put("PAPPERSISSORS", "LOSE");
        put("PAPPERPAPPER", "DRAW");
        put("SISSORSROCK", "LOSE");
        put("SISSORSPAPPER", "WIN");
        put("SISSORSSISSORS", "DRAW");
    }};

    public static Player newGame(String playerName){
        players.remove(playerName);
        Player player = new Player(playerName);
        players.put(playerName,player);
        return players.get(playerName);
    }

    public static Player getGame(String playerName, String chose){
        if (!players.containsKey(playerName)){
            Player player = new Player(playerName);
            players.put(playerName,player);
        }
        Player player = players.get(playerName);
        player.setComputerChoose(getPcChose());
        player.setPlayerChoose(chose);
        String key = chose+player.getComputerChoose();
        switch (zaidimoLenetele.get(key)) {
            case "WIN" -> {
                player.setWins(player.getWins() + 1);
                player.setLastGame("WIN");
            }
            case "LOSE" -> {
                player.setLoses(player.getLoses() + 1);
                player.setLastGame("LOSE");
            }
            case "DRAW" -> {
                player.setDraw(player.getDraw() + 1);
                player.setLastGame("DRAW");
            }
        }
        return player;
    }

    public static Player getPlayer(String playerName){
        if (!players.containsKey(playerName)){
            Player player = new Player(playerName);
            players.put(playerName,player);
        }
        return players.get(playerName);
    }

    private static String getPcChose(){
        int sk = (int) (Math.random()*3);
        return switch (sk) {
            case 0 -> GameEnum.ROCK.name();
            case 1 -> GameEnum.PAPPER.name();
            case 2 -> GameEnum.SISSORS.name();
            default -> null;
        };
    }

}
