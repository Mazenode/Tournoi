package tournoi;

public class Joueur extends Personne {

  public String poste[] = {"Attaquant", "Défenseur", "Gardien"};
  public int chx;
  public String nomEquipe;
  
  public Joueur(String n, String p, int a, String nat,String Jeq, int choix){
      super(n,p,a,nat);      
      this.chx = choix;
      nomEquipe = Jeq;
  }
  
  public Joueur(){
       
  }
  
  @Override
  public String toString() {
        return String.format("Nom: %s; Prénom: %s; Age: %d; Nationnalité: %s; Poste: %s; Nom de l'equipe %s ",this.nom, this.prenom, this.age, this.nationnalite, this.poste[chx],this.nomEquipe);
   }
  
  public void setEqJoueur(String nomEquipe){
    this.nom = nomEquipe;
}
  
}
