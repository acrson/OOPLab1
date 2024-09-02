import java.util.Scanner;

public class Register {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Purse purse;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an amount of change: ");
        double amount = in.nextDouble();

        purse = makeChange(amount);

        System.out.println(purse.ToString());
    }

    // takes an amt and returns a Purse containing that amount in the fewest number of bills and coins.
    public static Purse makeChange(double amt)
    {
        Purse purse = new Purse(); // creates a new purse object to fill with money
        int hundreddollarbills, fiftydollarbills, twentydollarbills, tendollarbills, fivedollarbills,
                onedollarbills, quarters, dimes, nickels, pennies; /* if there are any issues, it is likely here.
         initialize these to zero by putting them outside the makeChange method but still within the Register class. */

        // CALCULATES NUMBER OF EACH DENOMINATION NEEDED TO AMOUNT TO AMT
        // Subtract the amt comparison value by a miniscule amount to ensure no precision deviation occurs
        for (hundreddollarbills = 0; amt >= 100.00 - 0.0001; hundreddollarbills++)
        {
            amt -= 100.00;
        }

        for (fiftydollarbills = 0; amt >= 50.00 - 0.0001; fiftydollarbills++)
        {
            amt -= 50.00;
        }

        for (twentydollarbills = 0; amt >= 20.00 - 0.0001; twentydollarbills++)
        {
            amt -= 20.00;
        }

        for (tendollarbills = 0; amt >= 10.00 - 0.0001; tendollarbills++)
        {
            amt -= 10.00;
        }

        for (fivedollarbills = 0; amt >= 5.00 - 0.0001; fivedollarbills++)
        {
            amt -= 5.00;
        }

        for (onedollarbills = 0; amt >= 1.00 - 0.0001; onedollarbills++)
        {
            amt -= 1.00;
        }

        for (quarters = 0; amt >= 0.25 - 0.0001; quarters++)
        {
            amt -= 0.25;
        }

        for (dimes = 0; amt >= 0.10 - 0.0001; dimes++)
        {
            amt -= 0.10;
        }

        for (nickels = 0; amt >= 0.05 - 0.0001; nickels++)
        {
            amt -= 0.05;
        }

        for (pennies = 0; amt >= 0.01 - 0.0001; pennies++)
        {
            amt -= 0.01;
        }

        // MAP DENOMINATIONS TO A PURSE HASHMAP
        purse.add(Denomination.hundreddollarbill, hundreddollarbills);
        purse.add(Denomination.fiftydollarbill, fiftydollarbills);
        purse.add(Denomination.twentydollarbill, twentydollarbills);
        purse.add(Denomination.tendollarbill, tendollarbills);
        purse.add(Denomination.fivedollarbill, fivedollarbills);
        purse.add(Denomination.onedollarbill, onedollarbills);
        purse.add(Denomination.quarter, quarters);
        purse.add(Denomination.dime, dimes);
        purse.add(Denomination.nickel, nickels);
        purse.add(Denomination.penny, pennies);

        return purse;
    }
}