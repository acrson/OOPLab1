import java.util.Scanner;

public class Register {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an amount of change: ");
        double amount = in.nextDouble();

        makeChange(amount);
    }

    // takes an amt and returns a Purse containing that amount in the fewest number of bills and coins.
    public static Purse makeChange(double amt)
    {
        Purse purse = new Purse(); // creates a new purse object to fill with money
        double change = amt; // Saves the amt value to another variable to be used later
        int quarters, dimes, nickels, pennies;

        // Subtract the amt comparison value by a miniscule amount to ensure no precision deviation occurs
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

        System.out.println(change + " can be counted using: \n" + quarters + " Quarters\n" + dimes + " Dimes\n" +
                nickels + " Nickels\n" + pennies + " Pennies");

        return purse;
    }
}