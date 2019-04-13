package tournoi;

//import java.util.Vector;

public class Joueur extends Personne {

  public String poste[] = {"Attaquant", "Défenseur", "Gardien"};
  public String equipe;
  public int chx;

  /**public Vector  concerne;
  public Vector  myContratE;
  public Vector  signe;*/
  
  public Joueur(String n, String p, int a, String nat, int choix/*, String e*/){
      super(n,p,a,nat);      
      this.chx = choix;
      //this.equipe = e;
  }

  @Override
  public String toString() {
        return ("Votre joueur se nomme : "+ this.nom + " "+ this.prenom +". "+
                    "Il a : "+ this.age + "ans."+
                    " Il est de nationnalité : " + this.nationnalite + " et il joue au poste de " +
                    this.poste[chx] + ".");
   }
}
