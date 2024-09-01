// name: name of the denomination
// amt: the amount of money this denomination represents
// form: “bill” or “coin”
// img: the string containing the image name for an image of the type of money

public record Denomination(String name, double amt, String form, String img) { }