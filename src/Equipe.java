package tournoi;

import java.util.*;

public class Equipe {
  int numEquipe;
  String nomEquipe;
  String ville;
  String pays;
  String [] tactique = {"4-4-2 à plat", "4-4-2 en losange", "4-2-3-1", "4-3-3", "3-5-2", "3-4-3"};
  int chx, nbJ;
  private List<Joueur> listeJoueurs;
  private Joueur j;
  
  public Equipe(String nom, /*int num,*/ String v, String p, List<Joueur> listeJoueurs, int choix, int nbJoueurs){
      this.nomEquipe = nom;
      //this.numEquipe = num;
      this.ville = v;
      this.pays = p;
      this.listeJoueurs = listeJoueurs;
      this.chx = choix;
      this.nbJ = nbJoueurs;
  }
  
  public List<Joueur> getJoueur() {
      return listeJoueurs;
  }

  @Override
  public String toString() {
        return String.format("Nom de l'équipe: %s; Ville: %s; Pays: %s; Tacique: %s; Joueurs :",this.nomEquipe, this.ville, this.pays, this.tactique[chx-1]);
   } 
  
  public Joueur getJoueur(Joueur joueur) {
      j = joueur;
      return j;
  }
  
  public void setJoueur(String nom) {
      nomEquipe = nom;
  }
  
  public void printJoueurs() {
      for (int i = 0; i < nbJ; i++) {
          System.out.println(listeJoueurs.get(i));
      }
  }
 
  
}
