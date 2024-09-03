// Carson Stell
// 9/2/2024
// OOP Lab 1: Making Change

public record Denomination(String name, double amt, String form, String img) {
    // Definition of denominations with form BILL
    static Denomination hundreddollarbill = new Denomination("Hundred Dollar Bill", 100.00, "bill", "currency/hundred_note.png");
    static Denomination fiftydollarbill = new Denomination("Fifty Dollar Bill", 50.00, "bill", "currency/fifty_note.png");
    static Denomination twentydollarbill = new Denomination("Twenty Dollar Bill", 20.00, "bill", "currency/twenty_note.png");
    static Denomination tendollarbill = new Denomination("Ten Dollar Bill", 10.00, "bill", "currency/ten_note.png");
    static Denomination fivedollarbill = new Denomination("Five Dollar Bill", 5.00, "bill", "currency/five_note.png");
    static Denomination onedollarbill = new Denomination("One Dollar Bill", 1.00, "bill", "currency/one_note.png");

    // Definition of denominations with form COIN
    static Denomination quarter = new Denomination("Quarter", 0.25, "coin", "currency/quarter.png");
    static Denomination dime = new Denomination("Dime", 0.10, "coin", "currency/dime.png");
    static Denomination nickel = new Denomination("Nickel", 0.05, "coin", "currency/nickel.png");
    static Denomination penny = new Denomination("Penny", 0.01, "coin", "currency/penny.png");
}