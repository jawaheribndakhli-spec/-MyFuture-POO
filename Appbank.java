import java.util.Scanner;
public class Appbank {
    public static void main(String[] args) {
    // les champs de la classe persone:
   Scanner scanner = new Scanner(System.in);
   System.out.print("Entez le CIN: ");
   String cin = scanner.nextLine();
   System.out.print("Entez le Nom: ");
   String Nom = scanner.nextLine();
   System.out.print("Entez le Prénom: ");
   String Prenom = scanner.nextLine();
   System.out.print("Entrez le Solde Initial (TND) ");
   double solde = scanner.nextDouble();
   final double PLAFOND_RETRAIT = 500.0;
   // la suite de l'etape 3 s'insère ici...
   System.out.print(PLAFOND_RETRAIT );
   int choix;
   //boucle principale
   do{
    System.out.print("\n--- MENU APPBANK ---");
    System.out.print("1.Consulter le compte ");
    System.out.print("2.Effectuer un depot");
    System.out.print("2.Effectuer un retrait");
    System.out.print("Votre choix(1-4) : ");
    choix = scanner.nextInt();
    switch (choix) {
        case 1:
            System.out.println("Client   :" + Nom + " " + Prenom + " (CIN : " + cin + ")");
        System.out.print("N° de compte : " + numeroCompte);
        System.out.print("solde Actuel : " + solde + "TND");
        System.out.print("Plafond Max : " + PLAFOND_RETRAIT+ "TND");
        break;
        



    }

   }

    }
}
