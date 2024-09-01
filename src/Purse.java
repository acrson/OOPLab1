import java.util.HashMap;
import java.util.Map;

public class Purse {
    Map<Denomination, Integer> cash = new HashMap<>();

    void add(Denomination type, int num) {
        // Adds a number of a particular denomination
        cash.put(type, num);
    }

    double remove(Denomination type, int num) {
        cash.remove(type, num);
        // Returns the value of the denomination times how many of that denomination was in the purse
        return type.amt() * num;
    }

    double getValue() {
        // Returns the amount of money in the Purse
        double total = 0.0;
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            total += entry.getKey().amt() * entry.getValue();
        }
        return total;
    }

    String ToString() {
        // Returns a string representation of the Purse and its contents
        String string = "";
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            string += entry.getKey().name() + ":\t\t" + entry.getValue() + "\n";
        }
        return string;
    }
}