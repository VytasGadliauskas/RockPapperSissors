package lt.bit.zaidimas;

public class Testams {


    public static void main(String[] args) {
        Game.newGame("Playeris");
        for (int i = 0; i < 10; i++) {
          System.out.println(Game.getGame("Playeris",getPcChose()));

        }

    }

    private static String getPcChose(){
        int sk = (int) (Math.random()*3);
        switch (sk){
            case 0:
                return GameEnum.ROCK.name();
            case 1:
                return GameEnum.PAPPER.name();
            case 2:
                return GameEnum.SISSORS.name();
        }
        return null;
    }

}
