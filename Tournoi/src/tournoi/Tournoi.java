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
        buf = sc.next();
        competition1.setNomCompetition(buf);
        System.out.println("Vous avez entré : "+ competition1.getNomCompetition());
    }
}
