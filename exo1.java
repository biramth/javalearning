import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre prenom : ");
        String prenom = scanner.nextLine();
        System.out.println("Bienvenue sur votre convertisseur " + prenom);

        System.out.print("Entrez la distance en Km : ");
        double distkm = scanner.nextDouble();
        double distmiles = distkm * 0.621371;
        System.out.println("La distance en miles est de " + distmiles);

        System.out.print("Entrez la temperature en celcius : ");
        double tempc = scanner.nextDouble();
        double tempf = tempc * 33.8;
        System.out.println("La temperature en fahrenheit est de " + tempf);

        System.out.print("Entrez la masse en kg : ");
        double masskg = scanner.nextDouble();
        double masslb = masskg * 2.20462;
        System.out.println("La masse en livre est de " + masslb);
    }
}
