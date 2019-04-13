package tournoi;

import java.util.*;

public class Tournoi {
    public static void main(String[] args) { 
        ArrayList listeJoueur = new ArrayList();
        ArrayList listeArbitre = new ArrayList();  
        ArrayList listeEntrainneur = new ArrayList();
        ArrayList listeCompet = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        typePersonne(listeJoueur, listeArbitre, listeEntrainneur, sc);
                      
        /*creerCompetition(listeCompet, sc);
        System.out.println(listeCompet);*/
    }   
    
    public static void typePersonne(ArrayList listeJ, ArrayList listeA, ArrayList listeE, Scanner sc) {
        String buf;
        int nbEquipes;
        System.out.println("Choisissez le poste du participant : ");
        System.out.println("1. Joueur");
        System.out.println("2. Arbitre");
        System.out.println("3. Entraînneur");
        nbEquipes = sc.nextInt();
        switch (nbEquipes){
            case 1:
                creerJoueur(listeJ, sc);
            break;
            case 2:
                creerArbitre(listeA, sc);
            break;
            case 3:
                creerEntrainneur(listeE, sc);
            break;
        }                                   
    }
    
    public static void creerPersonne(ArrayList liste, Scanner sc){
        
    }
    
    public static void creerJoueur(ArrayList liste, Scanner sc) {
        System.out.println("On va créer un joueur !");
        creerPersonne(liste, sc);
    }
    
    public static void creerArbitre(ArrayList liste, Scanner sc) {
        System.out.println("On va créer un arbitre !");
        creerPersonne(liste, sc);
    }
    
    public static void creerEntrainneur(ArrayList liste, Scanner sc) {
        System.out.println("On va créer un Entrainneur !");
        creerPersonne(liste, sc);
    }
    
    public static void creerCompetition(ArrayList liste, Scanner sc){
        Competition competition = new Competition();
        liste.add(competition);        
        String buf;
        int nbEquipes;
        
        System.out.println("Entrez le nom de le compétition :");
        buf = sc.nextLine();
        competition.setNomCompetition(buf);      
        
        System.out.println("Entrez le nombre d'équipes participantes à la compétition :");
        nbEquipes = sc.nextInt();
        competition.setNbEquipes(nbEquipes);        
        
        for (int i = 1; i < nbEquipes+1; i++) {
            System.out.println("Entrez le nom de l'équipe " +i+" :");
            buf = sc.next();
            competition.setNomEquipe(buf);             
        }
        
        System.out.println("Entrez le lieu de déroulement de la compétition: ");
        buf = sc.next();
        competition.setLieu(buf);
        
        //Récapitulatif des entrées
        /*System.out.println("Votre compétition se nomme \""+ competition.getNomCompetition()+"\".");
        System.out.println("Elle est composée de "+ competition.getNbEquipes()+" équipes, les voici :");
        for (int i = 1; i < nbEquipes+1; i++) {
            System.out.print(competition.getNomEquipe());      
            System.out.print("    ");
        }
        System.out.println(".");
        System.out.println("La compétition se déroulera à "+competition.getLieu()+".");
        */                          
    }
}
