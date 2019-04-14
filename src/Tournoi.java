package tournoi;

import java.util.*;

public class Tournoi {
    public static void main(String[] args) { 
        ArrayList listeJoueur = new ArrayList();
        ArrayList listeArbitre = new ArrayList();  
        ArrayList listeEntrainneur = new ArrayList();
        ArrayList listeCompet = new ArrayList(); 
        ArrayList listeMatch = new ArrayList(); 
        ArrayList listeEquipe = new ArrayList();
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        
        afficherTitre();
        
        while (choix != 6) {
            afficherMenu();
            choix = sc.nextInt(); 
            switch (choix) {
                case 1:
                    creerCompetition(listeCompet, sc);
                break;
                case 2:
                    creerPersonne(listeJoueur, listeArbitre, listeEntrainneur, sc);
                break;
                case 3:
                    System.out.println("Lol la fonction n'existe pas encore");
                break;
                case 4:
                    System.out.println("Lol la fonction n'existe pas encore");
                break;
                case 5:
                    choixAffichage(listeCompet, listeJoueur, listeArbitre, listeEntrainneur, listeEquipe, listeMatch, sc);
                break;
            }
        }
        
        System.exit(0);
    }   
    
    public static void creerPersonne(ArrayList listeJ, ArrayList listeA, ArrayList listeE, Scanner sc){
        String nom, prenom, nationnalite, buf;
        int age, bufInt;
        System.out.println("Entrez le nom :");
        buf = sc.next();
        nom = buf;
        
        System.out.println("Entrez le prénom :");
        buf = sc.next();
        prenom = buf;
        
        System.out.println("Entrez l'âge :");
        bufInt = sc.nextInt();
        age = bufInt;
        
        System.out.println("Entrez la nationnalité :");
        buf = sc.next();
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
    
    public static void creerJoueur(String nom, String prenom, int age, String nationnalite, ArrayList listeJ, Scanner sc) {
        int choix;
        System.out.println("Choisissez le poste du joueur : ");
        System.out.println("1. Attaquant");
        System.out.println("2. Défenseur");
        System.out.println("3. Gardien");
        choix = sc.nextInt();
                     
        Joueur joueur = new Joueur(nom, prenom, age, nationnalite, choix);
        listeJ.add(joueur);
    }
    
    public static void creerArbitre(String nom, String prenom, int age, String nationnalite, ArrayList listeA, Scanner sc) {
        int choix;
        System.out.println("Choisissez le poste de l'arbitre : ");
        System.out.println("1. Arbitre central");
        System.out.println("2. Arbitre de touche");
        System.out.println("3. Arbitre assistant");
        choix = sc.nextInt();
                     
        Arbitre arbitre = new Arbitre(nom, prenom, age, nationnalite, choix);
        listeA.add(arbitre);
    }
    
    public static void creerEntrainneur(String nom, String prenom, int age, String nationnalite, ArrayList liste, Scanner sc) {
        
    }
    
    public static void creerCompetition(ArrayList liste, Scanner sc){
        Competition competition = new Competition();
        liste.add(competition);        
        String buf;
        int nbEquipes;
        
        System.out.println("Entrez le nom de le compétition :");
        buf = sc.next();
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
    
    public static void afficherTitre() {
        System.out.println("  ______                             _        __        ____            __ \n" +
" /_  __/___  __  ___________  ____  (_)  ____/ /__     / __/___  ____  / /_\n" +
"  / / / __ \\/ / / / ___/ __ \\/ __ \\/ /  / __  / _ \\   / /_/ __ \\/ __ \\/ __/\n" +
" / / / /_/ / /_/ / /  / / / / /_/ / /  / /_/ /  __/  / __/ /_/ / /_/ / /_  \n" +
"/_/  \\____/\\__,_/_/  /_/ /_/\\____/_/   \\__,_/\\___/  /_/  \\____/\\____/\\__/  \n" +
"                                                                           ");
        
    }
    
    public static void afficherMenu() {
        System.out.println(" ");
        System.out.println("Bienvenue !");
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("1. Créer une compétition");
        System.out.println("2. Créer un participant (joueur, arbitre ou entrainneur)");
        System.out.println("3. Créer une équipe");
        System.out.println("4. Créer un match");
        System.out.println("5. Afficher...");
        System.out.println("6. Quitter");
    }
    
    
    public static void choixAffichage(ArrayList listeCompetition, ArrayList listeJoueur, ArrayList listeArbitre, ArrayList listeEntrainneur, ArrayList listeEquipe,  ArrayList listeMatch, Scanner sc) {
        
        System.out.println("1. Afficher les compétitons");
        System.out.println("2. Afficher les joueurs");
        System.out.println("3. Afficher les arbitres");
        System.out.println("4. Afficher les entrainneurs");
        System.out.println("5. Afficher les équipes");
        System.out.println("6. Afficher les matchs");
        int choix = sc.nextInt();
        
        switch (choix) {
            case 1 :
                System.out.println(listeCompetition);
            break;
            case 2 :
                System.out.println(listeJoueur);
            break;
            case 3 :
                System.out.println(listeArbitre);
            break;
            case 4 :
                System.out.println(listeEntrainneur);
            break;
            case 5 :
                System.out.println(listeEquipe);
            break;
            case 6 :
                System.out.println(listeMatch);
            break;
        }
    }
}
