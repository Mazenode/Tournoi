package tournoi;

//import java.util.Vector;

public class Entrainneur /*extends Personne */{
    
  private String nom;
  private String prenom;
  private int age;
  private String nationnalite;
  public String nomEquipe;

  public Entrainneur(String n, String p, int a, String EnEq, String nat){
      nom = n;
      prenom = p;
      age = a;
      nationnalite = nat;
      nomEquipe = EnEq;
  }
  public void setEqEntrainneur(String nomEquipe){
    this.nom = nomEquipe;
}
  @Override
  public String toString() {
        return String.format("Nom: %s; Prénom: %s; Age: %d; Nationnalité: Equipe entrainner: %s; ",nom, prenom, age, nationnalite,nomEquipe);
   }
}
