// name: name of the denomination
// amt: the amount of money this denomination represents
// form: “bill” or “coin”
// img: the string containing the image name for an image of the type of money

public record Denomination(String name, double amt, String form, String img) {
    // Denominations with form BILL
    static Denomination hundreddollarbill = new Denomination("Hundred Dollar Bill", 100.00, "bill", "n/a");
    static Denomination fiftydollarbill = new Denomination("Fifty Dollar Bill", 50.00, "bill", "n/a");
    static Denomination twentydollarbill = new Denomination("Twenty Dollar Bill", 20.00, "bill", "n/a");
    static Denomination tendollarbill = new Denomination("Ten Dollar Bill", 10.00, "bill", "n/a");
    static Denomination fivedollarbill = new Denomination("Five Dollar Bill", 5.00, "bill", "n/a");
    static Denomination onedollarbill = new Denomination("One Dollar Bill", 1.00, "bill", "n/a");

    // Denominations with form COIN
    static Denomination quarter = new Denomination("Quarter", 0.25, "coin", "n/a");
    static Denomination dime = new Denomination("Dime", 0.10, "coin", "n/a");
    static Denomination nickel = new Denomination("Nickel", 0.05, "coin", "n/a");
    static Denomination penny = new Denomination("Penny", 0.01, "coin", "n/a");
}