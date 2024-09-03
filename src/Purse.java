// Carson Stell
// 9/2/2024
// OOP Lab 1: Making Change

import java.util.LinkedHashMap;
import java.util.Map;

public class Purse {
    /* Create a linked hash map with Denomination as the key (K) and the number of the given denomination
       as the value (V) */
    Map<Denomination, Integer> cash = new LinkedHashMap<>();

    // Adds a number of a particular denomination
    void add(Denomination type, int num) {
        cash.put(type, num);
    }

    // Removes given denomination from the purse object
    double remove(Denomination type, int num) {
        cash.remove(type, num);
        // Returns the value of the denomination times how many of that denomination was in the purse
        return type.amt() * num;
    }

    // Returns the amount of money in the Purse as a double
    double getValue() {
        double total = 0.0;
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            total += entry.getKey().amt() * entry.getValue();
        }
        return total;
    }

    // Returns a string representation of the Purse and its contents
    String ToString() {
        String string = "";

        if (this.getValue() < 0.005) {
            string = "Empty Purse";
        }

        else {
            for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
                if (entry.getValue() > 0) {
                    string += entry.getValue() + " " + entry.getKey().name() + "\n";
                }
            }
        }

        return string;
    }
}