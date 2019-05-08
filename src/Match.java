

import java.util.*;

//import java.util.Vector;

public class Match {

  
  private List<Arbitre> listeArbitre;
  public int scoreEquipe1 = 0;
  public int scoreEquipe2 = 0;
  public int val = 0;
  public int dureeMatch;
  public String arbitre;
  public String lieuStade;
  public int nbE,nbA;
  public List<Equipe> ListeEquipe;



  public Match(int time, int score1, int score2, List<Equipe> ListeEq, List<Arbitre> ListeAr, String nstade, int nbE, int nbA){
    dureeMatch = time;
    ListeEquipe = ListeEq;
    scoreEquipe2 = score2;
    scoreEquipe1 = score1;
    listeArbitre = ListeAr;
    nstade = lieuStade;
    this.nbE = nbE;
    this.nbA = nbA;
  }

  /*@Override
  public String toString() {
    return toString("La duree du match est de %s , Le score Final est de %s : %s",dureeMatch, this.ListeEquipe.get(0),this.scoreEquipe1,this.scoreEquipe2);
  }*/

  public void printEquipe() {
    for (int i = 0; i < nbE; i++) {
        System.out.println(ListeEquipe.get(i));
    }
  }
  public void printArbitre() {
        System.out.println(listeArbitre.get(0));
  }
  
  public List<Equipe> getEquipe(List<Equipe> listeEquipe) {
    return listeEquipe;
  }

  public List<Arbitre> Match(List<Arbitre> listeArbitre) {
    return this.listeArbitre;
  }
}
