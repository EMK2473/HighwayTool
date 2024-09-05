import java.util.Scanner;

public class HighwayTool {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber = scnr.nextInt();
        
        if (highwayNumber < 1 || highwayNumber > 999) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        } else if (highwayNumber <= 99) {
            // Primary highways
            if (highwayNumber % 2 == 0) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
        } else {
            // Auxiliary highways
            int primaryNumber = highwayNumber % 100;
            
            if (primaryNumber == 0 || primaryNumber > 99) {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            } else {
                if (primaryNumber % 2 == 0) {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
                }
            }
        }
        scnr.close();
    }
}