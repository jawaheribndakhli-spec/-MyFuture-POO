
import java.util.Scanner;
public class Produit {
    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;
    public Produit(String reference, String designation,
                   double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }
    public String getReference() {
        return reference;
    }
    public String getDesignation() {
        return designation;
    }
    public double getPrixHT() {
        return prixHT;
    }
    public int getQuantiteStock() {
        return quantiteStock;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }
    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }
    public double calculerValeurStock() {
        Scanner sc = new Scanner(System.in);
        System.out.print("La quantité : ");
        quantiteStock = sc.nextInt();
        System.out.print("Le prix HT : ");
        prixHT = sc.nextDouble();
        return quantiteStock * prixHT;
    }
    public double AppliquerRemise(double remise) {
        prixHT = prixHT - (prixHT * remise / 100);
        return prixHT;
    }
    public void afficher() {
        System.out.println("Reference : " + reference);
        System.out.println("Designation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Quantite Stock : " + quantiteStock);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produit p1 = new Produit("P101", "Clavier", 50.000, 10);
        Produit p2 = new Produit("P102", "Ecran", 40.000, 3);
        int choix;
        do {
            System.out.println("\n1- Afficher");
            System.out.println("2- Calculer prix");
            System.out.println("3- Appliquer remise");
            System.out.println("4- Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    p1.afficher();
                    break;
                case 2:
                    System.out.println("Valeur du stock : "
                            + p1.calculerValeurStock());
                    break;
                case 3:
                    System.out.print("Donner la remise : ");
                    double remise = sc.nextDouble();
                    p1.AppliquerRemise(remise);
                    System.out.println("Nouveau prix HT : "
                            + p1.getPrixHT());
                    break;
                case 4:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 4);
        sc.close();
    }
}
