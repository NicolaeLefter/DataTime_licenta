import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void alegePlan( Scanner scanner, ProgramLicentiere programLicentiere){



        System.out.println("Alegeti un plan de licenta");

        for (PlanLicenta plan : PlanLicenta.values()) {
            System.out.println(plan.getDescriere() + ", " + "pret pe luna " + plan.getPretPlan() + " durata " + plan.getDurata());
        }
        System.out.println("Daca aveti deja un plan de licenta scrietii: OMITE");
        System.out.println("Alegeti un plan de licenta: BASIC, STANDART, PREMIUM");

        String alegePlan = scanner.next();
        switch (alegePlan) {
            case "BASIC":
                programLicentiere.setareLicenta(PlanLicenta.BASIC);
                System.out.println("Ati selectat planul de licenta BASIC");
                break;
            case "STANDART":
                programLicentiere.setareLicenta(PlanLicenta.STANDART);
                System.out.println("Ati selectat planul de licenta STANDART");
                break;
            case "PREMIUM":
                programLicentiere.setareLicenta(PlanLicenta.PREMIUM);
                System.out.println("Ati selectat planul de licenta PREMIUM");
                break;
            case"NULL":
                System.out.println("Bine ati venit!");


        }

    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ProgramLicentiere programLicentiere = new ProgramLicentiere();


        System.out.println("Aveti un plan de licenta?");
        System.out.println("1 - DA");
        System.out.println("2 - NU");
        int omite = scanner.nextInt();

        if (omite == 2){

                alegePlan(scanner, programLicentiere);
        } else if (omite == 1) {

            throw new Exception("Nu poti alege asa optiune!");
        }
        System.out.println("1. Verifică starea licenței");
        System.out.println("2. Afișează durata licenței");
        System.out.println("3. Prelungește licența");
        System.out.print("Alegeți opțiunea: ");

        int alegere = scanner.nextInt();

        switch (alegere) {
            case 1:
                if (programLicentiere.verificareLicenta()) {
                    System.out.println("Licenta este valabila!");
                } else {
                    System.out.println("Licenta este expirata");
                }
                break;
            case 2:
                programLicentiere.afiseazaDurataLicentei();
                break;
            case 3:
                System.out.println("Introduceti numarul de luni pentru prelungirea licentei");
                int numarLuni = scanner.nextInt();
                programLicentiere.prelungesteLicenta(numarLuni);
                System.out.println("Licenta a fost pelungita cu : " + numarLuni + " luni");
                programLicentiere.afiseazaDurataLicentei();
                break;
            default:
                System.out.println("Optiune invalida.Reincearca");
        }


      /*  programLicentiere.setareLicenta(PlanLicenta.BASIC);
       programLicentiere.afiseazaDurataLicentei();
        System.out.println(programLicentiere.verificareLicenta()); */


    }

}