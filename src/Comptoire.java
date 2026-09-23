import java.util.Scanner;

import static java.lang.System.in;

public class Comptoire {
    public static void main(String[] args) {
        Scanner Username = new Scanner(in);
        System.out.println("Comment vous applez");
        String name = Username.nextLine();
        System.out.println("Bonjour : " + name);
        System.out.println("Veillez choisir le Numéro du produits ");

        String[] headers = {"Num", "Produits", "Prix", "Categories"};
        Object[][] data = {
                {"1", "Robe", 24  , "Femme"},
                {"2", "Chemise", 27, "Homme"},
                {"3", "Patallon", 13, "Enfents"},
        };

        System.out.println("---------------------------------------");
        System.out.println(headers[0] + " | " + headers[1] + " | " + headers[2] + " | " + headers[3]);
        for (Object[] row : data) {
            System.out.println("--------------------------------");
            System.out.println(row[0] + " |  " + row[1] + " | " + row[2] + " | " + row[3]);
        }
        System.out.println("le numéro : ");
        Scanner Choix = new Scanner(in);
        String numero = Choix.nextLine();

        if (numero.equals(data[0][0])) {
            System.out.println("Merci de votre choix");
            System.out.println("Mettez votre quantité");
            System.out.println("Quantité : ");
            Scanner Quantite1 = new Scanner(in);
            int QuantiteTotal1 = Quantite1.nextInt();
            int prix = (Integer) data[0][2];   // cast Object Integer
            int somme1 = QuantiteTotal1 * prix;
            if (somme1 >= 50) {
                int remise = somme1 * 10 / 100;
                int prixTotal = somme1 - remise;
                System.out.println("Votre facture est : ");
                System.out.println("Prénom : " + name);
                System.out.println("Nom : " + data[0][1] +  "\n" + "Le prix unitaire : " + data[0][2] + "\n" + "Le catégorie : " + data[0][3]);
                System.out.println("Quantité : " + QuantiteTotal1);
                System.out.println("Votre prix initial est : " + somme1 + " £ ");
                System.out.println("Vous avez une remise :  10% " );
                System.out.println("Le prixTotal est : " + prixTotal + " £" );
                System.out.println("Vous avez écconomisé : " + remise + " £ sur votre achats" );

            }else {
                System.out.println("Votre facture est : ");
                System.out.println("Prénom : " + name);
                System.out.println("Nom : " + data[0][1] +  "\n" + "Le prix unitaire : " + data[0][2] + "\n" + "Le catégorie : " + data[0][3]);
                System.out.println("Quantité : " + QuantiteTotal1);
                System.out.println("Votre prix total est : " + somme1 + " £ ");
            }

        }else if (numero.equals(data[1][0])) {
            System.out.println("Merci de votre choix");
            System.out.println("Mettez votre quantité");
            System.out.println("Quantité : ");
            Scanner Quantite2 = new Scanner(in);
            int QuantiteTotal2 = Quantite2.nextInt();
            int prix = (Integer) data[0][2];   // cast Object Integer
            int somme2 = QuantiteTotal2 * prix;
            if (somme2 >= 50) {
                int remise = somme2 * 10 / 100;
                int prixTotal = somme2 - remise;
                System.out.println("Votre facture est : ");
                System.out.println("Prénom : " + name);
                System.out.println("Nom : " + data[1][1] +  "\n" + "Le prix unitaire : " + data[1][2] + "\n" + "Le catégorie : " + data[1][3]);
                System.out.println("Quantité : " + QuantiteTotal2);
                System.out.println("Votre prix initial est : " + somme2 + " £ ");
                System.out.println("Vous avez une remise :  10 % " );
                System.out.println("Le prixTotal est : " + prixTotal + " £" );
                System.out.println("Vous avez écconomisé : " + remise + " £ sur votre achats" );
            }else {
                System.out.println("Votre facture est : ");
                System.out.println("Prénom : " + name);
                System.out.println("Nom : " + data[0][1] +  "\n" + "Le prix unitaire : " + data[0][2] + "\n" + "Le catégorie : " + data[0][3]);
                System.out.println("Quantité : " + QuantiteTotal2);
                System.out.println("Votre prix total est : " + somme2 + " £ ");

            }

        }
        else if (numero.equals(data[2][0])) {
            System.out.println("Merci de votre choix");
            System.out.println("Mettez votre quantité");
            System.out.println("Quantité : ");
            Scanner Quantite3 = new Scanner(in);
            int QuantiteTotal3 = Quantite3.nextInt();
            int prix = (Integer) data[0][2];   // cast Object Integer
            int somme3 = QuantiteTotal3 * prix;

            if (somme3 >= 50) {
                int remise = somme3 * 10 / 100;
                int prixTotal = somme3 - remise;
                System.out.println("Votre facture est : ");
                System.out.println("Prénom : " + name);
                System.out.println("Nom : " + data[1][1] +  "\n" + "Le prix unitaire : " + data[1][2] + "\n" + "Le catégorie : " + data[1][3]);
                System.out.println("Quantité : " + QuantiteTotal3);
                System.out.println("Votre prix initial est : " + somme3 + " £ ");
                System.out.println("Vous avez une remise :  10 % " );
                System.out.println("Le prixTotal est : " + prixTotal + " £" );
                System.out.println("Vous avez écconomisé : " + remise + " £ sur votre achats" );
            }else {
                System.out.println("Votre facture est : ");
                System.out.println("Prénom : " + name);
                System.out.println("Nom : " + data[1][1] +  "\n" + "Le prix unitaire : " + data[1][2] + "\n" + "Le catégorie : " + data[1][3]);
                System.out.println("Quantité : " + QuantiteTotal3);
                System.out.println("Votre prix total est : " + somme3 + " £ ");

            }
        }
        else {
            System.out.println("Le numero n'existe pas sur le tableaux");
        }
    }

}
