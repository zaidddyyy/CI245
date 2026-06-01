package hw3;

public class Stock {
	String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Method to calculate percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
