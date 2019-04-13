package tournoi;

import java.util.*;

public class Tournoi {
    public static void main(String[] args) { 
        ArrayList listeJoueur = new ArrayList();
        ArrayList listeArbitre = new ArrayList();  
        ArrayList listeEntrainneur = new ArrayList();
        ArrayList listeCompet = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        creerPersonne(listeJoueur, listeArbitre, listeEntrainneur, sc);
                      
        /*creerCompetition(listeCompet, sc);
        System.out.println(listeCompet);*/
    }   
    
    public static void creerPersonne(ArrayList listeJ, ArrayList listeA, ArrayList listeE, Scanner sc){
        String nom, prenom, nationnalite, buf;
        int age, bufInt;
        System.out.println("Entrez le nom :");
        buf = sc.nextLine();
        nom = buf;
        
        System.out.println("Entrez le prénom :");
        buf = sc.nextLine();
        prenom = buf;
        
        System.out.println("Entrez l'âge :");
        bufInt = sc.nextInt();
        age = bufInt;
        
        System.out.println("Entrez la nationnalité :");
        buf = sc.nextLine();
        nationnalite = buf;      
        
        int choix;
        System.out.println("Choisissez le poste du participant : ");
        System.out.println("1. Joueur");
        System.out.println("2. Arbitre");
        System.out.println("3. Entraînneur");
        choix = sc.nextInt();
        switch (choix){
            case 1:
                System.out.println("On va créer un joueur !");
                creerJoueur(nom, prenom, age, nationnalite, listeJ, sc);
            break;
            case 2:
                System.out.println("On va créer un arbitre !");
                creerArbitre(nom, prenom, age, nationnalite, listeA, sc);
            break;
            case 3:
                System.out.println("On va créer un Entrainneur !");               
                creerEntrainneur(nom, prenom, age, nationnalite, listeE, sc);
            break;
        }                       
    }
    
    public static void creerJoueur(String nom, String prenom, int age, String nationnalite, ArrayList liste, Scanner sc) {
        int choix;
        System.out.println("Choisissez le poste du joueur : ");
        System.out.println("1. Attaquant");
        System.out.println("2. Défenseur");
        System.out.println("3. Gardien");
        choix = sc.nextInt();
                     
        Joueur joueur = new Joueur(nom, prenom, age, nationnalite, choix);
    }
    
    public static void creerArbitre(String nom, String prenom, int age, String nationnalite, ArrayList liste, Scanner sc) {
        
    }
    
    public static void creerEntrainneur(String nom, String prenom, int age, String nationnalite, ArrayList liste, Scanner sc) {
        
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
