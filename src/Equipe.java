
import java.util.*;

public class Equipe {
  int numEquipe;
  String nomEquipe;
  String ville;
  String pays;
  int chx, nbJ,nbE,victoire=0,defaite=0,nul=0,but=0;
  private List<Joueur> listeJoueurs;
  private Joueur j;
  private List<Entrainneur> listeEntraineurs;
  private String tactique;
  
  public Equipe(String nom, /*int num,*/ String v, String p, List<Joueur> listeJoueurs, int choix, int nbJoueurs,int nbEntraineur, List<Entrainneur> listeEntraineurs){
      this.nomEquipe = nom;
      //this.numEquipe = num;
      this.ville = v;
      this.pays = p;
      this.listeJoueurs = listeJoueurs;
      this.listeEntraineurs = listeEntraineurs;
      this.chx = choix;
      this.nbJ = nbJoueurs;
      this.nbE = nbEntraineur;
      this.tactique = tactique;
  }
  public Equipe(){
    
   }

  
  public List<Joueur> getJoueur() {
      return listeJoueurs;
  }

  public List<Entrainneur> getEntraineur(){
      return listeEntraineurs;
  }

  @Override
  public String toString() {
        return String.format("Nom de l'équipe: %s; Entraineur: %s; Ville: %s; Pays: %s; Tacique: %s; Joueurs :",this.nomEquipe, this.listeEntraineurs.get(0), this.ville, this.pays, this.tactique);
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

  public void printEntraineur() {
        for (int e = 0; e < nbE; e++) {
          System.out.println(listeEntraineurs.get(e));
      }
    }
  // ajout des scores/victoire/defaite
  public void addScore(int b){
      but += b;
  }
  public int getScore(){
    return but;
  }
  //Victoire
  public void addVictoire(int v){
      victoire += v;
  }
  
  public int getVictoire(){
      return victoire;
  }
  
  //Defaite
  public void addDefaite(int d){
      defaite += d;
  }
  public int getDefaite(){
      return defaite;
  }
  
  //Nul
  public void addNul(int n){
      nul += n;
  }
 
  public int getNul(){
      return nul;
  }
}
  
   
