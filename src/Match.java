package tournoi;

import com.sun.tools.javac.util.List;

//import java.util.Vector;

public class Match {

  public String equipe1;
  public String equipe2;
  public int scoreEquipe1;
  public int scoreEquipe2;
  public int val = 0;
  public String arbitre;
  public String lieuStade;

  private List<Equipe> ListeEquipe;

  /**  public Vector  myArbitre;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myParticipation;
    public Vector  myEquipe;
    public Competition composition;
    public Vector  joue;
    public Vector  concerne;*/

  public Match(int time ,List<Equipe> ListeEquipe, Liste<Arbitre> ListeArbitre, String nstade){
    this.dureeMatch = time;
    this.ListeEquipe = equipe1;
    this.ListeEquipe = equipe2;
    this.ListeArbitre = arbitre;
    this.nstade = lieuStade;
  }
  public Integer addScoreEquipe1() {
  return null;
  }

  public Integer addScoreEquipe2() {
  return null;
  }

  public List<Equipe> getEquipe(){
    return ListeEquipe;
  }

  public void setEquipe1(List<Equipe> listeEquipe) {
    equipe1 = listeEquipe;
    val++;
  }

  public void setEquipe2(String n) {
    equipe2 = n;
    val++;
  }

  public void getArbitre(String n) {
    arbitre = n;
    val++;
  }

  public void isMatch(){
    if(val == 3){
      addScoreEquipe1();
      addScoreEquipe2();
  }
  else{
    System.out.println("Impossible de lancer le match il lui manque une composante");
  }
}

}
