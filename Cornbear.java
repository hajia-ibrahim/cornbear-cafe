/*
 * File: Cornbear.java
 * Author: Hajia Ibrahim
 *
 * Description:
 *    Generates a detailed café receipt for Cornbear's Café, including
 *    item totals, tax, fees, and a formatted timestamp.
 *
 * Date: October 2025
 */
public class Cornbear {
    public static void main (String[] args){

        int espressoQuantity = 2;
        double espressoPrice = 4.08;
        double espressoSubtotal = (espressoPrice * espressoQuantity);
        int latteQuantity = 7;
        double lattePrice = 6.25;
        double latteSubtotal = (lattePrice * latteQuantity);
        int fogQuantity = 4;
        double fogPrice = 4.87;
        double fogSubtotal = (fogPrice * fogQuantity);
        double numberOfHours = 121.4;
        double subtotal = (espressoSubtotal + latteSubtotal + fogSubtotal);
        String dash = ("-------------------------");
        double taxRate = 0.1035;
        double unroundedTax = subtotal * taxRate;
        double tax = (int) (unroundedTax * 100)/ 100.0;
        double serviceFee = 1.21;
        double unroundedCornbear = subtotal % (espressoQuantity + latteQuantity + fogQuantity); 
        double cornbearFee = (int) (unroundedCornbear * 100)/ 100.0;
        double unroundedTotal = subtotal + tax + serviceFee + cornbearFee;
        double grandTotal = (int) (unroundedTotal * 100)/ 100.0;
        int roundedHours = (int) numberOfHours;
        int daysPassed = roundedHours/24;
        int dayOfMonth = daysPassed + 1;
        int timeOfDay = roundedHours % 24;




        System.out.println(dash);
        System.out.println("     Cornbear's Café");
        System.out.println(" University of Washington");
        System.out.println("        \"Seattle\"");
        System.out.println(dash);
        System.out.println(espressoQuantity + " Espresso         $" + (espressoQuantity * espressoPrice));
        System.out.println(latteQuantity + " Sesame Latte     $" + latteQuantity * lattePrice);
        System.out.println(fogQuantity + " Seattle Fog      $" + fogQuantity * fogPrice);
        System.out.println(dash);
        System.out.println("Subtotal           $" + subtotal);
        System.out.println(dash);
        System.out.println("Tax                $" + tax );
        System.out.println("Service fee        $" + serviceFee);
        System.out.println("Cornbear fee       $" + cornbearFee);
        System.out.println(dash);
        System.out.println("Total              $" + grandTotal);
        System.out.println(dash);
        System.out.println("       thank you <3");
        System.out.println("      "+ timeOfDay + ":00 " +"1/" + dayOfMonth + "/2025");


    } 
}
