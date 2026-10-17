import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue sur votre PGI");
        System.out.print("Entrez votre nom : ");
        
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Entrez 4 notes !");
        System.out.print("1 : ");
        double note1 = scanner.nextDouble();
        System.out.print("2 : ");
        double note2 = scanner.nextDouble();
        System.out.print("3 : ");
        double note3 = scanner.nextDouble();
        System.out.print("4 : ");
        double note4 = scanner.nextDouble();
        scanner.close();

        double moyenne = (note1 + note2 + note3 + note4) / 4;

        System.out.print("Vous avez une moyenne de "+ moyenne + " avec une ");
        if(moyenne >= 18) System.out.println("Mention TB + felicitation du jury");
        else if (moyenne >= 16 && moyenne < 18) System.out.println("Mention TB");
        else if (moyenne >= 14 && moyenne < 16) System.out.println("Mention Bien");
        else if (moyenne >= 12 && moyenne < 14) System.out.println("Mention Assez Bien");
        else if (moyenne >= 10 && moyenne < 12) System.out.println("Mention Passable");
        else System.out.println("Vous n'etes pas admis");
    }
}
