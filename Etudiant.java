
import java.util.Scanner;
public class Etudiant {
    private String codeE;
    private String nom;
    private String prenom;
    private int age;
    private String ville;
    // 2) Constructeur paramétré
    public Etudiant(String codeE, String nom, String prenom, int age, String ville) {
        this.codeE = codeE;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }
    // Constructeur vide
    public Etudiant() {
    }
    // 3) Getters et setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    // 4) Procédure saisirE
    public void saisirE(Scanner sc) {
        System.out.print("Code : ");
        codeE = sc.nextLine();
        System.out.print("Nom : ");
        nom = sc.nextLine();
        System.out.print("Prenom : ");
        prenom = sc.nextLine();
        System.out.print("Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Ville : ");
        ville = sc.nextLine();
    }
    // 5) Procédure afficherE
    public void afficherE() {
        System.out.println("Code : " + codeE
                + " , Nom : " + nom
                + " , Prenom : " + prenom
                + " , Age : " + age
                + " , Ville : " + ville);
    }
    // 7) Afficher l'âge maximum
    public static void afficherAgeMax(Etudiant[] tab) {
        int max = tab[0].getAge();
        for (int i = 1; i < tab.length; i++) {
            if (tab[i].getAge() > max) {
                max = tab[i].getAge();
            }
        }
        System.out.println("Le plus grand age est : " + max);
    }
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Etudiant[] tab = new Etudiant[3];
        // Test du constructeur paramétré
        tab[0] = new Etudiant("E1", "Ben Ali", "Sami", 20, "Tunis");
        // Test de saisirE
        tab[1] = new Etudiant();
        tab[1].saisirE(sc);
        tab[2] = new Etudiant();
        tab[2].saisirE(sc);
        // Test de afficherE
        for (Etudiant e : tab) {
            e.afficherE();
        }
        // Test des getters / setters
        tab[0].setNom("Trabelsi");
        tab[0].setPrenom("Ahmed");
        System.out.println(tab[0].getNom() + " " + tab[0].getPrenom());
        // Test de la question 7
        afficherAgeMax(tab);
        sc.close();
    }
}
