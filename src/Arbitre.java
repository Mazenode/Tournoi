public class Arbitre extends Personne{
    private int num_match;
    private String position;

    public Arbitre(int vnum_match, String vposition){
      num_match = vnum_match;
      position = vposition;
    }

    public String getPosition(String position) {
        return position;
    }

    public String getnum_match(int num_match) {
        return num_match;

    }
}
