package tournoi;

//import java.util.Vector;

public class Participation {

  public int cartonR;
  public int cartonJ;

  public int nbButs;
  public int note;

  private Match listeEquipe;

  public Participation(int but, int note, int cartonJa, int cartonRo){
    this.nbButs = but;
    this.note = note;
    this.cartonR = cartonRo;
    this.cartonJ = cartonJa;
  }
}
