public class Joueur extends Personne{
    private int num;
    private String[] poste = new String[4];
    private String equipe;
    private int stat;

    public void getPoste(){
        poste[0] = "Gardien";
        poste[1] = "Défenseur";
        poste[2] = "Milieu";
        poste[3] = "Attaquant";
    }

    public String setPoste(int i) {
        return this.poste[i];
    }
}
