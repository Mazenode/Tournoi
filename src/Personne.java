public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String nationnalite;

    public Personne(){}

    public Personne(String nom, String prenom, int age, String nationnalite){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.nationnalite = nationnalite;
        }

public String getNom() {
        return nom;
        }

public String getPrenom() {
        return prenom;
        }

public int getAge() {
        return age;
        }

public String getNationnalite(String nationnalite) {
        return nationnalite;
        }

public String toString() {
        return "Nom: "+ nom +"; Prénom: "+ prenom +"; Age: "+ age + "; Nationnalité: "+nationnalite;
}
}
