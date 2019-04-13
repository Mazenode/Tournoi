package tournoi;

//import java.util.Vector;

public class Joueur extends Personne {

  public int numJoueur;
  public String equipe;

  /**public Vector  concerne;
  public Vector  myContratE;
  public Vector  signe;*/
  
  public Joueur(String n, String p, int a, String nat, int num, String e){
      super(n,p,a,nat);
      this.numJoueur = num;
      this.equipe = e;
  }

  public void getJoueur() {
      
  }

}
