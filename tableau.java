
import java.util.Scanner;
public class tableau {
    public static void main(String[] args) {
        //question1://
        double[] moyenne = {10.50, 11.50, 14};
//question4:réaliser la 2ème valeur du tableau:
moyenne[1] = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(moyenne[i]);
        }
        //question2:longaur de tableau:
        System.out.println(moyenne.length);
        //question3:creer un autre tableau de 3 réels introduit par l'utilisateaur:
        Scanner sc = new Scanner(System.in);
        double[] tab = new double[3];
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Donner le réel numéro " + (i + 1) + " : ");
            tab[i] = sc.nextDouble();
        }
        System.out.println("La taille du tableau est : " + tab.length);
        System.out.println("Les valeurs du tableau sont :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        sc.close();
        //question4:réaliser la 2ème valeur du tableau:
        //question5:la somme des éléments de deux tableaux:
       double[] tab3 = new double[3];
for (int i = 0; i < 3; i++) {
    tab3[i] = moyenne[i] + tab[i];
}
System.out.println("Le tableau resultat est :");
for (int i = 0; i < 3; i++) {
    System.out.println(tab3[i]);
}
    }
}

