package tournoi;

import java.util.Scanner;

public class Tournoi {
    public static void main(String[] args) {
        creerCompetition();
    }   
    
    public static void creerCompetition(){
        Competition competition1 = new Competition();
        Scanner sc = new Scanner(System.in);
        String buf;
        int nbEquipes;
        
        System.out.println("Entrez le nom de le compétition :");
        buf = sc.nextLine();
        competition1.setNomCompetition(buf);      
        
        System.out.println("Entrez le nombre d'équipes participantes à la compétition :");
        nbEquipes = sc.nextInt();
        competition1.setNbEquipes(nbEquipes);        
        
        for (int i = 1; i < nbEquipes+1; i++) {
            System.out.println("Entrez le nom de l'équipe " +i+" :");
            buf = sc.next();
            competition1.setNomEquipe(buf, i);             
        }
        
        System.out.println("Entrez le lieu de déroulement de la compétition: ");
        buf = sc.next();
        competition1.setLieu(buf);
        
        //Récapitulatif des entrées
        System.out.println("Votre compétition se nomme \""+ competition1.getNomCompetition()+"\".");
        System.out.println("Elle est composée de "+ competition1.getNbEquipes()+" équipes, les voici :");
        for (int i = 1; i < nbEquipes+1; i++) {
            System.out.print(competition1.getNomEquipe(i));      
            System.out.print("    ");
        }
        System.out.println(".");
        System.out.println("La compétition se déroulera à "+competition1.getLieu()+".");
    }
}
