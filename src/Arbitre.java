
public class Arbitre extends Personne {

  public int numMatch;
  public int chx;
  public String poste;

  //  public Vector  myMatch;

  public Arbitre(String n, String p, int a, String nat, String poste/*, String e*/){
      super(n,p,a,nat);      
      //this.equipe = e;
      this.poste = poste;
  }

  @Override
  public String toString() {
        return ("Nom et prénom : "+ this.nom + " "+ this.prenom +". "+
                    "Age : "+ this.age +
                    " Nationnalité : " + this.nationnalite + " et c'est un "+ this.poste + ".");
   }
  
  public String getnom() {
      return nom;
  }
  public String getprenom() {
      return prenom;
  }
  public int getage() {
      return age;
  }
  public String getnationnalite() {
      return nationnalite;
  }
  public String getposte() {
      return poste;
  }
}