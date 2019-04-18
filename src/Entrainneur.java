package tournoi;

//import java.util.Vector;

public class Entrainneur /*extends Personne */{

  public String equipe;
  private String nom;
  private String prenom;
  private int age;
  private String nationnalite;

  public Entrainneur(String n, String p, int a, String nat){
      nom = n;
      prenom = p;
      age = a;
      nationnalite = nat;
  }

  @Override
  public String toString() {
        return String.format("Nom: %s; Prénom: %s; Age: %d; Nationnalité: %s",nom, prenom, age, nationnalite);
   }
}
