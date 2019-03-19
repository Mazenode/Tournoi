public class Competition extends Equipe{
    private String nom_compet;
    private int nbr_eq;
    private String lieu;

    public Competition(String vnom_compet, int vnbr_eq, String vlieu){
      vnom_compet = nom_compet;
      vnbr_eq = nbr_eq;
      vlieu = lieu;
    }
    public String getnom_compet(){
      return(nom_compet);
    }
    public int getnbr_eq(){
      return(nbr_eq);
    }
    public String getlieu(){
      return(lieu);
    }
}
