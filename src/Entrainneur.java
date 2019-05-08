//import java.util.Vector;

public class Entrainneur /*extends Personne */{
    
  private String nom;
  private String prenom;
  private int age;
  private String nationnalite;
  public String nomEquipe;

  public Entrainneur(String n, String p, int a, String nat, String EnEq){
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
        return String.format("Nom: %s; Prénom: %s; Age: %d; Nationnalité: %s; Equipe entrainner: %s; ",nom, prenom, age, nationnalite,nomEquipe);
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
}
