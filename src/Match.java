package tournoi;

import com.sun.tools.javac.util.List;

//import java.util.Vector;

public class Match {

  private List<Joueur> listeJoueurs;
  private List<Joueur> listeArbitre;
  public int scoreEquipe1 = 0;
  public int scoreEquipe2 = 0;
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

  public Match(int time, int score1, int score2, List<Equipe> ListeEquipe, Liste<Arbitre> ListeArbitre, String nstade,int nbrEquipe,int nbrArbitre){
    this.dureeMatch = time;
    this.ListeEquipe = ListeEquipe;
    this.score1 = scoreEquipe1;
    this.score2 = scoreEquipe2;
    this.ListeArbitre = ListeArbitre;
    this.nstade = lieuStade;
    this.nbE = nbrEquipe;
    this.nbA = nbrArbitre;

  }
  /*public Integer addScoreEquipe1(int score) {
    scoreEquipe1 += score;

  }

  public Integer addScoreEquipe2() {
    scoreEquipe2 += score;
  }*/


  @Override
  public String toString() {
    return super.toString("La duree du match est de %s , Le score Final est de %s : %s,",this.dureeMatch,this.ListeEquipe[0],this.scoreEquipe1,this.ListeEquipe[1],this.scoreEquipe2);
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
  


  public void getEquipe(List<Equipe> listeEquipe) {
    return listeEquipe;
  }

  public void getArbitre(String n) {
    arbitre = n;
  }

}
