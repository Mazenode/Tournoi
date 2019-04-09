package tournoi;

//import java.util.Vector;

public class Competition {

  public String nom;
  public String [] equipe = new String[100];
  public int nbEquipes;
  public String lieu;

 /**public Vector  myEquipe;
  public Vector  composition;
  public Vector  myEquipe;*/
  
  public Competition(){
      System.out.println("Création d'une compétition");
      nom = "Inconnu";
      nbEquipes = 0;
      lieu = "Inconnu";
  }

  public void setNomCompetition(String pNom) {
       nom = pNom;
  }
  public void setNomEquipe(String pEquipe, int i) {
       equipe[i] = pEquipe;
  }
  public void setNbEquipes(int pNbEquipes) {
       nbEquipes = pNbEquipes;
  }
  public void setLieu(String pLieu) {
       lieu = pLieu;
  }

  public String getNomCompetition() {
      return nom;
  }
  public String getNomEquipe(int i) {
      return equipe[i];
  }
  public int getNbEquipes() {
       return nbEquipes;
  }
  public String getLieu() {
       return lieu;
  }
}
