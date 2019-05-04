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
  private List<Entraineur> listeEntraineurs;
  
  public Equipe(String nom, /*int num,*/ String v, String p, List<Joueur> listeJoueurs, int choix, int nbJoueurs, List<Entrainneur> listeEntraineurs){
      this.nomEquipe = nom;
      //this.numEquipe = num;
      this.ville = v;
      this.pays = p;
      this.listeJoueurs = listeJoueurs;
      this.listeEntraineurs = listeEntraineurs;
      this.chx = choix;
      this.nbJ = nbJoueurs;
  }
  
  public List<Joueur> getJoueur() {
      return listeJoueurs;
  }

  public List<Entrainneur> getEntraineur(){
      return listeEntraineurs;
  }

  @Override
  public String toString() {
        return String.format("Nom de l'équipe: %s; Entraineur: %s; Ville: %s; Pays: %s; Tacique: %s; Joueurs :",this.nomEquipe, this.listeEntraineurs[0], this.ville, this.pays, this.tactique[chx-1]);
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

  public void printEntraineu() {
        System.out.println(listeEntraineurs.get(0));
}
 
  
}
