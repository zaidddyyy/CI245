package hw3;

public class StockTest {
	public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Stock: " + stock.name);
        System.out.println("Change Percent: " + stock.getChangePercent() + "%");
    }
}
