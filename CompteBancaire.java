public class CompteBancaire{
    private string numerocompte;
    private double solde;
    private Client titulaire;
    private static int nombreCompte=0;
    public CompteBancaire( string numeroCompte, double soldeinitial,
        Client titulaire){
            this.numeroCompte=numeroCompte;
            this.solde=soldeinitial;
            this.titulaire=titulaire;
            nombreCompte++;
        }
        public string getnumeroCompte(){return numeroCompte; }
        public public double getsolde(){return solde;}
        public Client gettitulaire(){ return titulaire; }
    public static int getNombreComptes() { return nombreComptes; }
    public void setTitulaire(Client titulaire) { this.titulaire = titulaire; }
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Erreur : le montant du dépôt doit être supérieur à 0.");
        }
    }
 public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Échec : Solde insuffisant sur le compte " + numeroCompte
                    + " (Solde actuel : " + solde + " TND).");
        }
    }
 public void virement(CompteBancaire destination, double montant) {
        System.out.println("\n Tentative de virement de " + montant + " TND vers le compte "
                + destination.getNumeroCompte() + "...");
        if (montant > 0 && montant <= solde) {
            this.retirer(montant);
            destination.deposer(montant);
            System.out.println("Virement réussi !");
        } else {
            System.out.println("Virement échoué : montant invalide ou solde insuffisant.");
        }
    }
 public void afficherDetails() {
        System.out.println("Compte N° : " + numeroCompte);
        System.out.print("Titulaire : ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel : " + solde + " TND");
    }
}       