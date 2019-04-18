package tournoi;

public class Joueur extends Personne {

  public String poste[] = {"Attaquant", "Défenseur", "Gardien"};
  public int chx;
  
  public Joueur(String n, String p, int a, String nat, int choix){
      super(n,p,a,nat);      
      this.chx = choix;
  }

  @Override
  public String toString() {
        return String.format("Nom: %s; Prénom: %s; Age: %d; Nationnalité: %s; Poste: %s",this.nom, this.prenom, this.age, this.nationnalite, this.poste[chx]);
   }

}
