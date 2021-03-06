package tournoi;

//import java.util.Vector;

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
      nbEquipes = 0;
      lieu = "Inconnu";
  }

  public void setNomCompetition(String pNom) {
       nom = pNom;
  }
  public void setNomEquipe(String pEquipe) {
       equipe = pEquipe;
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
  public String getNomEquipe() {
      return equipe;
  }
  public int getNbEquipes() {
       return nbEquipes;
  }
  public String getLieu() {
       return lieu;
  }
  
  @Override
  public String toString() {
        return ("Votre compétition se nomme \""+ this.getNomCompetition()+"\"."+
                    ", Nom de l'équipe : "+ this.getNomEquipe() +
                    ", nb d'équipes : "+ this.getNbEquipes() +
                    ", Lieu : " + this.getLieu()) +
                    ".";
   }
}
