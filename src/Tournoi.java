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
                    listeEquipe = creerEquipe(listeJoueur, listeArbitre, listeEntrainneur, listeEquipe, compteurEquipe, sc);
                    compteurEquipe++;
                break;
                case 4:
                    listeMatch = creerMatch(listeEquipe,compteurEquipe,listeEquipe,listeArbitre,listeJoueur,listeMatch,sc);
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

    public static ArrayList<Match> creerMatch(ArrayList<Entrainneur> listeE, int compteurEquipe, ArrayList<Equipe> listeEq, ArrayList<Arbitre> listeA, ArrayList<Joueur> listeJ, ArrayList<Match> listeM, Scanner sc){
        ArrayList listeEquipeSelec = new ArrayList();
        ArrayList listeArbitreSelec = new ArrayList();
        String nomStade = null;
        int bufInt,scoreEq1,scoreEq2;
        boolean verifE = true;
        boolean verifA =true;
        System.out.println(" ");
        System.out.println("On vas cree un match pour cela il nous faut 2 equipes");
        System.out.println("Quelle est le lieu du match ?");
        String buf = sc.nextLine();
        buf = nomStade;

        System.out.println("Quelle a été la duree du match ?");
        int time = sc.nextInt();

        while(listeEquipeSelec.size() <= 2){
            System.out.println(" ");
            System.out.println("1.Cree une Equipe");
            System.out.println("2.Chosiser parmis des equipes existante");
            int selecE = sc.nextInt();
            int i = 0;
            int e = 0;

            if(selecE == 1){
                creerEquipe(listeJ, listeA, listeE,listeEq, compteurEquipe, sc);
                listeEquipeSelec.add(listeE.get(listeE.size() - 1));
                System.out.println("l'Equipe ajouté !");
            }

            else if (selecE == 2){
                if(listeE.isEmpty()){
                    System.out.println("La liste des equipe est vide");
                }
                else if(listeE.size() == listeEquipeSelec.size()){
                    System.out.println("il n'y a plus d'equipe a selectionner, vous devez en cree une");
                }
                else{
                    while(i < listeEquipeSelec.size()){
                        if(listeE.get(selecE)==listeEquipeSelec.get(i)){
                            System.out.println("Cette equipe à déja été séléctionné !");
                            verifE = false;
                            afficherListe(listeEquipeSelec);
                            i = listeEquipeSelec.size();
                        }
                        else {
                            i = listeEquipeSelec.size();
                            verifE = true;
                        }
                    }
                    if (verifE == true) {
                        System.out.println(" ");
                        System.out.println("Entrez le nom de l'equipe que vous souhaitez ajouter au match : ");
                        afficherEquipe(listeE);
                        selecE = sc.nextInt()-1;
                        sc.nextLine();
                        listeEquipeSelec.add(listeE.get(selecE));
                        System.out.println("Joueur ajouté !");
                        afficherListe(listeEquipeSelec);
                    }

                }
            }
        }
        while(listeArbitreSelec.size() < 1){
            System.out.println(" ");
            System.out.println("1.Cree un arbitre");
            System.out.println("2.Choisir un arbitre deja existant");
            int selecA = sc.nextInt();
            int e = 0;

            if(selecA == 1){
                creerPersonne(listeJ, listeA, listeE, sc, 1);
                listeArbitreSelec.add(listeA.get(listeA.size() - 1));
                System.out.println("l'Arbitre est ajouté !");
            }

            else if (selecA == 2){
                if(listeA.isEmpty()){
                    System.out.println("La liste des Arbitres est vides");
                }
                else if(listeA.size() == listeArbitreSelec.size()){
                    System.out.println("il n'y a plus d'Arbitre a selectionner, vous devez en cree une");
                }
                else{
                    while(e < listeArbitreSelec.size()){
                        if(listeA.get(selecA)==listeArbitreSelec.get(e)){
                            System.out.println("Cette Arbitre à déja été séléctionné !");
                            verifA = false;
                            afficherListe(listeArbitreSelec);
                            e = listeArbitreSelec.size();
                        }
                        else {
                            e = listeArbitreSelec.size();
                            verifA = true;
                        }
                    }
                    if (verifA == true) {
                        System.out.println(" ");
                        System.out.println("Entrez le nom de l'Arbitre que vous souhaitez ajouter au match : ");
                        afficherArbitre(listeA);
                        selecA = sc.nextInt()-1;
                        sc.nextLine();
                        listeArbitreSelec.add(listeA.get(selecA));
                        System.out.println("Arbitre ajouté !");
                        afficherListe(listeArbitreSelec);
                    }

                }
            }

        }
        System.out.println("Quelle est le score de l'equipe 1 ?");
        scoreEq1 = sc.nextInt();

        System.out.println(" ");
        System.out.println("Quelle est le score de l'equipe 2 ?");
        scoreEq2 = sc.nextInt();



        Match match = new Match(time, scoreEq1, scoreEq2, listeEquipeSelec, listeArbitreSelec, nomStade, listeArbitreSelec.size(), listeEquipeSelec.size());
        System.out.println(match);
        match.printEquipe();
        match.printArbitre();
        listeM.add(match);
        //afficherListe(listeMacthSelec);
        return listeM;
    }

    public static ArrayList<Equipe> creerEquipe(ArrayList<Joueur> listeJ, ArrayList<Arbitre> listeA, ArrayList<Entrainneur> listeE, ArrayList<Equipe> listeEq, int compteurEquipe, Scanner sc){
        ArrayList listeJoueurSelec = new ArrayList();
        ArrayList listeEntraineurSelec = new ArrayList();
        String buf, nom, ville, pays;
        int bufInt,num, choix = 0;
        int selecJ = 0;
        int selecE = 0;
        boolean verif = true;
        System.out.println("On va créer une équipe (l'équipe doit comporter au minimum 3 joueurs et au maximum 24 joueurs.");

        System.out.println("Choisissez le nom de l'équipe n°"+compteurEquipe+" : ");
        buf = sc.nextLine();
        nom = buf;
        
        System.out.println("Combien de joueur voulez vous mettre dans votre equipe ?");
        bufInt = sc.nextInt();
        num = bufInt;
        
        
        System.out.println("Renseignez le nom de la ville :");
        buf = sc.next();
                
        ville = buf;

        System.out.println("Renseignez le nom du pays :");
        buf = sc.next();
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

        while(listeJoueurSelec.size() < num) {
            System.out.println(" ");
            System.out.println("1. Ajouter un joueur existant");
            System.out.println("2. Créer un joueur puis l'ajouter à l'équipe");
            selecJ = sc.nextInt();

            if (selecJ == 1) {
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
                    if (listeJ.get(selecJ)==listeJoueurSelec.get(i)){
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
                    selecJ = sc.nextInt()-1;
                    sc.nextLine();
                    listeJoueurSelec.add(listeJ.get(selecJ));
                    System.out.println(listeJ.get(0));  
                    System.out.println("Joueur ajouté !");
                    afficherListe(listeJoueurSelec);
                }
                }
            }
            else if (selecJ == 2) {
                creerPersonne(listeJ, listeA, listeE, sc, 1);
                //On ajoute le dernier élément de la liste de joueurs, celui que l'on vient de créer
                Joueur temp = new Joueur();
                temp = listeJ.get(listeJ.size() - 1);
                listeJoueurSelec.add(listeJ.get(listeJ.size() - 1));
                System.out.println(listeJ.get(listeJ.size() - 1).nomEquipe = nom);
                System.out.println("Joueur ajouté !");
            }
        }
        // Choix de l'entraineur
        while(listeEntraineurSelec.size() < 1) {
            System.out.println(" ");
            System.out.println("1. Ajouter un Entraineur existant");
            System.out.println("2. Créer un Entraineur puis l'ajouter à l'équipe");
            selecE = sc.nextInt();

            if (selecE == 1) {
                //Gestion des collisions dans le liste de joueurs sélectionnés
                int e = 0;
                if (listeE.isEmpty()){
                    System.out.println("La liste des Entraineur est vide !");
                }
                else if (listeE.size() == listeEntraineurSelec.size()){
                    System.out.println("Il n'y a plus d'Entraineur disponnibles, vous devez impérativement en créer un !");
                }
                else {
                    while (e < listeEntraineurSelec.size()) {
                    if (listeE.get(selecE)==listeEntraineurSelec.get(e)){
                        System.out.println("Ce joueur à déja été séléctionné !");
                        verif = false;
                        afficherListe(listeEntraineurSelec);
                        e = listeEntraineurSelec.size();
                    }
                    else {
                        e = listeEntraineurSelec.size();
                        verif = true;
                    }
                }
                if (verif == true) {
                    System.out.println(" ");
                    System.out.println("Entrez le numéro de l'entraineur que vous souhaitez ajouter à l'équipe : ");
                    afficherJoueur(listeE);
                    selecE = sc.nextInt()-1;
                    sc.nextLine();
                    listeEntraineurSelec.add(listeE.get(selecE));
                    System.out.println("Entraineur ajouté !");
                    afficherListe(listeEntraineurSelec);
                }
                }
            }
            else if (selecE == 2) {
                creerPersonne(listeJ, listeA, listeE, sc, 3);
                //On ajoute le dernier élément de la liste de joueurs, celui que l'on vient de créer
                listeEntraineurSelec.add(listeE.get(listeE.size() - 1));
                System.out.println("Entraineur ajouté !");
            }
        }

        Equipe equipe = new Equipe(nom, ville, pays, listeJoueurSelec, choix, listeJoueurSelec.size(),listeEntraineurSelec.size(),listeEntraineurSelec);
        System.out.println(equipe);
        //equipe.printJoueurs();
        //equipe.printEntraineur();
        listeEq.add(equipe);
        //afficherListe(listeJoueurSelec); la aussi
        return listeEq;
    }

    public static ArrayList<Competition> creerCompetition(ArrayList<Competition> listeC, ArrayList listeJ, ArrayList listeA, ArrayList listeE, int compteurEquipe, ArrayList listeEq, Scanner sc){
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
                creerEquipe(listeJ, listeA, listeE, listeEq, compteurEquipe, sc);
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
