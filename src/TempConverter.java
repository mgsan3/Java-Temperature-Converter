import java.util.Scanner;

public class TempConverter {

    Integer convertedTemp;
    Double convertedKtemp;
    private Scanner user = new Scanner(System.in);
    String exp = "[0-9]+";


    public void convertFtoC() {
        Boolean statement = true;
        while (statement) {
            System.out.print("Please insert a temperture in F or [exit] to leave ");
            String temp = user.nextLine();

                    if (temp.equals("exit")) {
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


        }
    public void convertFtoK() {
        Boolean fTemp = true;
        while (fTemp) {
            System.out.print("Please insert a temperture in F or [exit] to leave ");
            String temp = user.nextLine();

                if (temp.equals("exit")) {
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
    }
    }
