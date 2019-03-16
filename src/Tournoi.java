import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Tournoi {
    public static void main(String [] args) {
        List<Personne> l = new ArrayList<Personne>();
        l.add(new Personne("Chaignaud", "Quentin", 19, "Française"));
        l.add(new Personne("Aubry", "Mathieu", 19, "Française"));
        System.out.println(l);
    }
}
