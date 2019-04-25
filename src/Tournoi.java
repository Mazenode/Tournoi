package tournoi;

package tournoi;

import java.util.*;

public class Tournoi {
    public static void main(String[] args) {
        //On déclare les listes d'objets
        ArrayList listeJoueur = new ArrayList();
        ArrayList listeArbitre = new ArrayList();
        ArrayList listeEntrainneur = new ArrayList();
        ArrayList listeCompet = new ArrayList();
        ArrayList listeMatch = new ArrayList();
        ArrayList listeEquipe = new ArrayList();
        int choix = 0;
        int compteurEquipe = 1;
        Scanner sc = new Scanner(System.in);

        afficherTitre();

        //Boucle pour réafficher le menu principal à chaque fin de fonction
        while (choix != 7) {
            afficherMenu();
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    //On passe la liste en paramètres avec le Scanner sous forme de variable pour éviter de le re-déclarer à chaque fonction
                    listeCompet = creerCompetition(listeCompet, listeJoueur, listeArbitre, listeEntrainneur, compteurEquipe, listeEquipe, sc);
                break;
                case 2:
                    creerPersonne(listeJoueur, listeArbitre, listeEntrainneur, sc, 0);
                break;
                case 3:
                    listeEquipe = creerEquipe(listeJoueur, listeArbitre, listeEntrainneur, compteurEquipe, sc);
                    compteurEquipe++;
                break;
                case 4:
                    listeMatch = creerMatch();
                break;
                case 5:
                    choixAffichage(listeCompet, listeJoueur, listeArbitre, listeEntrainneur, listeEquipe, listeMatch, sc);
                break;
                case 6:
                    afficherChoisirMenuSupprimer(listeCompet, listeJoueur, listeArbitre, listeEntrainneur, listeEquipe, listeMatch, sc);
                break;
            }
        }
        System.exit(0);
    }

    public static void creerPersonne(ArrayList listeJ, ArrayList listeA, ArrayList listeE, Scanner sc, int choix){
        String nom, prenom, nationnalite, buf;
        int age, bufInt;
        System.out.println(" ");
        System.out.println("Entrez le nom :");
        //On utilise un buffer qui prendra successivement les différentes entrées qu'on lui donnera
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

         if (choix < 1 || choix > 3) {
            System.out.println("Choisissez le poste du participant : ");
            System.out.println("1. Joueur");
            System.out.println("2. Arbitre");
            System.out.println("3. Entraînneur");
            choix = sc.nextInt();
        }

        switch (choix){
            case 1:
                creerJoueur(nom, prenom, age, nationnalite, listeJ, sc);
            break;
            case 2:
                creerArbitre(nom, prenom, age, nationnalite, listeA, sc);
            break;
            case 3:
                creerEntrainneur(nom, prenom, age, nationnalite, listeE, sc);
            break;
            default:
                System.out.println("Veuillez rentrez un nombre qui corresponde aux choix proposés.");
            break;
        }
    }

    public static Joueur creerJoueur(String nom, String prenom, int age, String nationnalite, ArrayList listeJ, Scanner sc) {
        int choix;
        System.out.println(" ");
        System.out.println("Choisissez le poste du joueur : ");
        System.out.println("1. Attaquant");
        System.out.println("2. Défenseur");
        System.out.println("3. Gardien");
        choix = sc.nextInt();

        Joueur joueur = new Joueur(nom, prenom, age, nationnalite, choix);
        listeJ.add(joueur);
        return joueur;
    }

    public static void creerArbitre(String nom, String prenom, int age, String nationnalite, ArrayList listeA, Scanner sc) {
        int choix;
        System.out.println(" ");
        System.out.println("Choisissez le poste de l'arbitre : ");
        System.out.println("1. Arbitre central");
        System.out.println("2. Arbitre de touche");
        System.out.println("3. Arbitre assistant");
        choix = sc.nextInt();

        Arbitre arbitre = new Arbitre(nom, prenom, age, nationnalite, choix);
        listeA.add(arbitre);
    }

    public static void creerEntrainneur(String nom, String prenom, int age, String nationnalite, ArrayList listeE, Scanner sc) {
        Entrainneur entrainneur = new Entrainneur(nom, prenom, age, nationnalite);
        listeE.add(entrainneur);
    }

    public static vooid creerMatch(ArrayList listE, ArrayList listA , ArrayList ListM){
        ArrayList listeEquipeSelec = new ArrayList();
        String buf, nomStade;
        int bufInt;
        System.out.println("Quelle est le score de l'equipe"+equipe1+" ?");
    }

    public static ArrayList<Equipe> creerEquipe(ArrayList listeJ, ArrayList listeA, ArrayList listeE, int compteurEquipe, Scanner sc){
        ArrayList listeJoueurSelec = new ArrayList();
        String buf, nom, ville, pays;
        int bufInt, choix = 0;
        int selec = 0;
        boolean verif = true;
        System.out.println("On va créer une équipe (l'équipe doit comporter au minimum 3 joueurs et au maximum 24 joueurs.");

        System.out.println("Choisissez le nom de l'équipe n°"+compteurEquipe+" : ");
        buf = sc.nextLine();
        nom = buf;

        System.out.println("Renseignez le nom de la ville :");
        buf = sc.nextLine();
        ville = buf;

        System.out.println("Renseignez le nom du pays :");
        buf = sc.nextLine();
        pays = buf;

        System.out.println("Renseignez la tactique par défaut de l'équipe :");
        System.out.println("1) 4-4-2 à plat");
        System.out.println("2) 4-4-2 en losange");
        System.out.println("3) 4-2-3-1");
        System.out.println("4) 4-3-3");
        System.out.println("5) 3-5-2");
        System.out.println("6) 3-4-3");

        choix = sc.nextInt();
        sc.nextLine();

        while(listeJoueurSelec.size() < 2) {
            System.out.println(" ");
            System.out.println("1. Ajouter un joueur existant");
            System.out.println("2. Créer un joueur puis l'ajouter à l'équipe");
            selec = sc.nextInt();

            if (selec == 1) {
                //Gestion des collisions dans le liste de joueurs sélectionnés
                int i = 0;
                if (listeJ.isEmpty()){
                    System.out.println("La liste des Joueurs est vide !");
                }
                else if (listeJ.size() == listeJoueurSelec.size()){
                    System.out.println("Il n'y a plus de joueurs disponnibles, vous devez impérativement en créer un !");
                }
                else {
                    while (i < listeJoueurSelec.size()) {
                    if (listeJ.get(selec)==listeJoueurSelec.get(i)){
                        System.out.println("Ce joueur à déja été séléctionné !");
                        verif = false;
                        afficherListe(listeJoueurSelec);
                        i = listeJoueurSelec.size();
                    }
                    else {
                        i = listeJoueurSelec.size();
                        verif = true;
                    }
                }
                if (verif == true) {
                    System.out.println(" ");
                    System.out.println("Entrez le numéro du joueur que vous souhaitez ajouter à l'équipe : ");
                    afficherJoueur(listeJ);
                    selec = sc.nextInt()-1;
                    sc.nextLine();
                    listeJoueurSelec.add(listeJ.get(selec));
                    System.out.println("Joueur ajouté !");
                    afficherListe(listeJoueurSelec);
                }
                }
            }
            else if (selec == 2) {
                creerPersonne(listeJ, listeA, listeE, sc, 1);
                //On ajoute le dernier élément de la liste de joueurs, celui que l'on vient de créer
                listeJoueurSelec.add(listeJ.get(listeJ.size() - 1));
                System.out.println("Joueur ajouté !");
            }
        }
        Equipe equipe = new Equipe(nom, ville, pays, listeJoueurSelec, choix, listeJoueurSelec.size());
        System.out.println(equipe);
        equipe.printJoueurs();
        listeE.add(equipe);
        //afficherListe(listeJoueurSelec);
        return listeE;
    }

    public static ArrayList<Competition> creerCompetition(ArrayList listeC, ArrayList listeJ, ArrayList listeA, ArrayList listeE, int compteurEquipe, ArrayList listeEq, Scanner sc){
        int choix = sc.nextInt();
        boolean verif = true;
        sc.nextLine();
        int selec = 0;
        ArrayList listeEquipeSelec = new ArrayList();
        while(listeEquipeSelec.size() < 1) {
            System.out.println(" ");
            System.out.println("1. Ajouter une équipe existante");
            System.out.println("2. Créer une équipe puis l'ajouter à la compétition");
            selec = sc.nextInt();

            if (choix == 1) {
                //Gestion des collisions dans le liste des équipes sélectionnées
                int i = 0;
                while (i < listeEquipeSelec.size()) {
                    if (listeEq.get(selec)==listeEquipeSelec.get(i)){
                        System.out.println("Cette équipe à déja été séléctionnée !");
                        verif = false;
                        afficherListe(listeEquipeSelec);
                        i = listeEquipeSelec.size();
                    }
                    else {
                        i = listeEquipeSelec.size();
                        verif = true;
                    }
                }
                if (verif == true) {
                    System.out.println(" ");
                    System.out.println("Entrez le numéro de l'équipe que vous souhaitez ajouter à la compétition : ");
                    afficherJoueur(listeEq);
                    selec = sc.nextInt()-1;
                    sc.nextLine();
                    listeEquipeSelec.add(listeEq.get(selec));
                    System.out.println("Joueur ajouté !");
                    afficherListe(listeEquipeSelec);
                }

            }
            else if (choix == 2) {
                creerEquipe(listeJ, listeA, listeE, compteurEquipe, sc);
                //On ajoute le dernier élément de la liste de joueurs, celui que l'on vient de créer
                listeEquipeSelec.add(listeEq.get(listeEq.size() - 1));
                System.out.println("Equipe ajoutée !");
            }
        }
        Competition competition = new Competition();
        listeC.add(competition);
        String buf;
        int nbEquipes;
        System.out.println(" ");
        System.out.println("Entrez le nom de le compétition :");
        buf = sc.next();
        competition.setNomCompetition(buf);

        System.out.println("Entrez le nombre d'équipes participantes à la compétition :");
        nbEquipes = listeEquipeSelec.size();
        competition.setNbEquipes(nbEquipes);

        System.out.println("Entrez le lieu de déroulement de la compétition : ");
        buf = sc.nextLine();
        competition.setLieu(buf);
        System.out.println(listeC);
        return listeC;
    }

    public static void afficherTitre() {
        System.out.println("  ______                             _        __        ____            __ \n" +
" /_  __/___  __  ___________  ____  (_)  ____/ /__     / __/___  ____  / /_\n" +
"  / / / __ \\/ / / / ___/ __ \\/ __ \\/ /  / __  / _ \\   / /_/ __ \\/ __ \\/ __/\n" +
" / / / /_/ / /_/ / /  / / / / /_/ / /  / /_/ /  __/  / __/ /_/ / /_/ / /_  \n" +
"/_/  \\____/\\__,_/_/  /_/ /_/\\____/_/   \\__,_/\\___/  /_/  \\____/\\____/\\__/  \n" +
"                                                                           ");
        System.out.println(" ");
        System.out.println("Bienvenue !");
    }

    public static void afficherMenu() {
        System.out.println(" ");
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("1. Créer une compétition");
        System.out.println("2. Créer un participant (joueur, arbitre ou entrainneur)");
        System.out.println("3. Créer une équipe");
        System.out.println("4. Créer un match");
        System.out.println("5. Afficher...");
        System.out.println("6. Quitter");
    }

    public static void choixAffichage(ArrayList listeCompetition, ArrayList listeJoueur, ArrayList listeArbitre, ArrayList listeEntrainneur, ArrayList listeEquipe,  ArrayList listeMatch, Scanner sc) {
        System.out.println(" ");
        System.out.println("1. Afficher les compétitons");
        System.out.println("2. Afficher les joueurs");
        System.out.println("3. Afficher les arbitres");
        System.out.println("4. Afficher les entrainneurs");
        System.out.println("5. Afficher les équipes");
        System.out.println("6. Afficher les matchs");

        int choix = sc.nextInt();
        sc.nextLine();

        switch (choix) {
            case 1 :
                afficherCompetition(listeCompetition);
            break;
            case 2 :
                afficherJoueur(listeJoueur);
            break;
            case 3 :
                afficherArbitre(listeArbitre);
            break;
            case 4 :
                afficherEntrainneur(listeEntrainneur);
            break;
            case 5 :
                afficherEquipe(listeEquipe);
            break;
            case 6 :
                afficherMatch(listeMatch);
            break;
        }
    }

    public static void afficherCompetition(ArrayList listeCompetition){
        if (listeCompetition.isEmpty()) {
                System.out.println("La liste des compétitons est vide.");
            }
        else {
            afficherListe(listeCompetition);
        }
    }

    public static void afficherJoueur(ArrayList listeJoueur){
        if (listeJoueur.isEmpty()) {
            System.out.println("La liste des joueurs est vide.");
        }
        else {
            afficherListe(listeJoueur);
        }
    }

    public static void afficherArbitre(ArrayList listeArbitre){
        if (listeArbitre.isEmpty()) {
            System.out.println("La liste des arbitres est vide.");
        }
        else {
            afficherListe(listeArbitre);
        }
    }

    public static void afficherEntrainneur(ArrayList listeEntrainneur){
        if (listeEntrainneur.isEmpty()) {
            System.out.println("La liste des entrainneurs est vide.");
        }
        else {
            afficherListe(listeEntrainneur);
        }
    }

    public static void afficherEquipe(ArrayList listeEquipe){
        if (listeEquipe.isEmpty()) {
            System.out.println("La liste des équipes est vide.");
        }
        else {
            afficherListe(listeEquipe);
        }
    }

    public static void afficherMatch(ArrayList listeMatch){
        if (listeMatch.isEmpty()) {
            System.out.println("La liste des matchs est vide.");
        }
        else {
            afficherListe(listeMatch);
        }
    }

    public static void afficherListe(ArrayList liste) {
        for (int i = 0; i < liste.size(); i++){
                System.out.println(i+1 + ") " +liste.get(i));
            }
    }

    public static void afficherChoisirMenuSupprimer(ArrayList listeCompetition, ArrayList listeJoueur, ArrayList listeArbitre, ArrayList listeEntrainneur, ArrayList listeEquipe,  ArrayList listeMatch, Scanner sc) {
        System.out.println(" ");
        System.out.println("1. Supprimmer une compétion");
        System.out.println("2. Supprimmer un joueur");
        System.out.println("3. Supprimmer un arbitre");
        System.out.println("4. Supprimmer un entrainneur");
        System.out.println("5. Supprimmer une équipe");
        System.out.println("6. Supprimmer un match");

        int choix = sc.nextInt();

        switch (choix) {
            case 1 :
                System.out.println("Entrez le n° de la compétition que vous souhaitez supprimmer : ");
                afficherCompetition(listeCompetition);
                supprimerObjet(listeCompetition, sc);
                System.out.println("Compétition supprimée !");
            break;
            case 2 :
                System.out.println("Entrez le n° du joueur que vous souhaitez supprimmer : ");
                afficherJoueur(listeJoueur);
                supprimerObjet(listeJoueur, sc);
                System.out.println("Joueur supprimé !");
            break;
            case 3 :
                System.out.println("Entrez le n° de l'arbitre que vous souhaitez supprimmer : ");
                afficherArbitre(listeArbitre);
                supprimerObjet(listeArbitre, sc);
                System.out.println("Arbitre supprimé !");
            break;
            case 4 :
                System.out.println("Entrez le n° de l'entrainneur que vous souhaitez supprimmer : ");
                afficherEntrainneur(listeEntrainneur);
                supprimerObjet(listeEntrainneur, sc);
                System.out.println("Entrainneur supprimé !");
            break;
            case 5 :
                System.out.println("Entrez le n° de l'équipe que vous souhaitez supprimmer : ");
                afficherEquipe(listeEquipe);
                supprimerObjet(listeEquipe, sc);
                System.out.println("Equipe supprimée !");
            break;
            case 6 :
                System.out.println("Entrez le n° du match que vous souhaitez supprimmer : ");
                afficherMatch(listeMatch);
                supprimerObjet(listeMatch, sc);
                System.out.println("Match supprimé !");
            break;
        }
    }

    public static void supprimerObjet(ArrayList liste, Scanner sc) {
        int choix = sc.nextInt();
        liste.remove(choix);
    }
}
