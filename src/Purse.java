import java.util.HashMap;
import java.util.Map;

public class Purse {
    // This class doesn't need a main. Only one main is needed and it's already contained within the
    // "Main" class. Just put purse definition and logic here.
    Map<Denomination, Integer> cash = new HashMap<>();

    void add(Denomination type, int num){
        // Adds a number of a particular denomination
        cash.put(type, num);
        // I think this is right? I'll come back to this.
    }

    double remove(Denomination type, int num){
        // diminishes the money in the purse and returns that amount.
    }

    double getValue() {
        // returns the amount of money in the Purse
    }

    String toString() {
        // returns a string representation of the Purse and its contents
    }
}