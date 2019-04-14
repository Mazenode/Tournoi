package tournoi;

//import java.util.Vector;

public class Arbitre extends Personne {

  public int numMatch;
  public int chx;
  public String position[] = {"arbitre central", "arbitre de touche", "arbitre assistant"};

  //  public Vector  myMatch;

  public Arbitre(String n, String p, int a, String nat, int choix/*, String e*/){
      super(n,p,a,nat);      
      this.chx = choix;
      //this.equipe = e;
  }

  @Override
  public String toString() {
        return ("Nom et prénom : "+ this.nom + " "+ this.prenom +". "+
                    "Age : "+ this.age +
                    " Nationnalité : " + this.nationnalite + " et c'est un " +
                    this.position[chx-1] + ".");
   }
}