
public class Joueur extends Personne {

  public String poste = "";
  public String nomEquipe;
  
  public Joueur(String n, String p, int a, String nat,String poste, String nomEquipe){
      super(n,p,a,nat);      
      this.nomEquipe = nomEquipe;
      this.poste = poste;
  }
  
  public Joueur(){
       
  }
  
  @Override
  public String toString() {
        return String.format("Nom: %s; Prénom: %s; Age: %d; Nationnalité: %s; Poste: %s; Nom de l'equipe %s ",this.nom, this.prenom, this.age, this.nationnalite, this.poste, this.nomEquipe);
   }
  
  public void setEqJoueur(String nomEquipe){
    this.nomEquipe = nomEquipe;
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
  public String getEq(){
	    return this.nomEquipe;
	}
}
