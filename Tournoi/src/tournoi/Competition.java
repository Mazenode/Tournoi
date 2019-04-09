package tournoi;

//import java.util.Vector;
import java.util.Scanner;

public class Competition {

  public String nom;
  public String equipe;
  public int nbEquipes;
  public String lieu;

 /**public Vector  myEquipe;
  public Vector  composition;
  public Vector  myEquipe;*/
  
  public Competition(){
      System.out.println("Création d'une compétition");
      nom = "Inconnu";
      equipe = "Inconnu";
      nbEquipes = 0;
      lieu = "Inconnu";
  }

  public void setNomCompetition(String pNom) {
       nom = pNom;
  }

  public String getNomCompetition() {
      return nom;
  }
}
