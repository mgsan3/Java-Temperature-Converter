import java.util.ArrayList;
import java.util.Scanner;

public class TempConverter {

    Integer convertedTemp;
    Double convertedKtemp;
    private Scanner user = new Scanner(System.in);
    ArrayList<Integer> storingTemps = new ArrayList<>();
    ArrayList<Double> storingKTemps = new ArrayList<>();
    String exp = "[0-9]+";


    public void convertTemps() {
        Boolean converter = true;
        while (converter) {
            System.out.print("Convert [1]Farenheit to Celsius or [2]Farenheit to Kelvin: ");
            int convertChoice = user.nextInt();

            try{
                if (convertChoice == 1) {
                    storingTemps.add(convertFtoC());


                }
                else if (convertChoice == 2) {

                    storingKTemps.add(convertFtoK());


                }
                else {
                    System.out.println("Sorry not a valid choice");
                }
            } catch (Exception ex) {
                System.out.println("Sorry something went wrong");
                System.exit(0);
            }
        }

    }

    public Integer convertFtoC() {
        Boolean statement = true;
        while (statement) {
            System.out.print("Please insert a temperture in F or [exit] to leave ");
            String temp = user.nextLine();

                    if (temp.equals("exit")) {
                        readingConverterList();
                        System.out.println("\nThank you for using the Temp Converter!");

                        System.exit(0);
                    }
                try {
                    int temps = Integer.parseInt(temp);
                    if (temp.matches(exp)) {
                        convertedTemp = (temps - 32) * 5 / 9;
                        System.out.println(String.format("\n%s degrees Farenheit is %s degrees Celsius\n", temps, convertedTemp));

                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid format");
                }

            }
        return convertedTemp;


        }
    public Double convertFtoK() {
        Boolean fTemp = true;
        while (fTemp) {
            System.out.print("Please insert a temperture in F or [exit] to leave ");
            String temp = user.nextLine();

                if (temp.equals("exit")) {
                    readingKConverterList();
                    System.out.println("\nThank you for using the Temp Converter!");

                    System.exit(0);
            }
            try {
                int fToKTemps = Integer.parseInt(temp);
                if (temp.matches(exp)) {
                    convertedKtemp = (fToKTemps - 32) * 5/9 + 273.15;
                    System.out.println(String.format("\n%s degrees Farenheit is %s degrees Kelvin\n", fToKTemps, convertedKtemp));

                }
            }catch (NumberFormatException numEx) {
                System.out.println("Invalid format");
            }
        }
        return convertedKtemp;
    }
    public void readingConverterList() {
        for (int results : storingTemps) {
            System.out.println(String.format("%s\n", results));
        }
    }
    public void readingKConverterList() {
        for (double results : storingKTemps) {
            System.out.println(String.format("%s\n", results));
        }
    }


}

