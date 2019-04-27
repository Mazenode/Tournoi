package tournoi;

import com.sun.tools.javac.util.List;

//import java.util.Vector;

public class Match {

  private List<Joueur> listeJoueurs;
  private List<Joueur> listeArbitre;
  public int scoreEquipe1;
  public int scoreEquipe2;
  public int val = 0;
  public String arbitre;
  public String lieuStade;
  public int nbE,nbA;
  private List<Equipe> ListeEquipe;

  /**  public Vector  myArbitre;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myEquipe;
    public Competition composition;
    public Vector  joue;
    public Vector  concerne;*/

  public Match(int time ,List<Equipe> ListeEquipe, Liste<Arbitre> ListeArbitre, String nstade,int nbrEquipe,int nbrArbitre){
    this.dureeMatch = time;
    this.ListeEquipe = listeJoueurs;
    this.ListeArbitre = ListeArbitre;
    this.nstade = lieuStade;
    this.nbE = nbrEquipe;
    this.nbA = nbrArbitre;

  }
  public Integer addScoreEquipe1() {
  return null;
  }

  public Integer addScoreEquipe2() {
  return null;
  }

  public List<Equipe> getEquipe(){
    return ListeEquipe;
  }


  @Override
  public String toString() {
    return super.toString("La duree du match est de %s L'equipe selectioner est %s et l'arbitre est %s",this.dureeMatch);
  }

  public void printEquipe() {
    for (int i = 0; i < nbE; i++) {
        System.out.println(ListeEquipe.get(i));
    }
  }
  public void printArbitre() {
    for (int i = 0; i < nbA; i++) {
        System.out.println(listeArbitre.get(i));
    }
  }

  public void setEquipe1(List<Equipe> listeEquipe) {
    equipe1 = listeEquipe;
    val++;
  }

  public void setEquipe2(String n) {
    equipe2 = n;
    val++;
  }

  public void getArbitre(String n) {
    arbitre = n;
    val++;
  }

  public void isMatch(){
    if(val == 3){
      addScoreEquipe1();
      addScoreEquipe2();
  }
  else{
    System.out.println("Impossible de lancer le match il lui manque une composante");
  }
}

}
