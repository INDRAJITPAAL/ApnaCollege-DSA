public class maxProfitOnStocks {
    public static int maxProfit(int price[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else if (price[i] - minPrice > maxPrice) {
                maxPrice = price[i] - minPrice;
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int price[] = { 7, 6, 4,  3, 1 };
        System.out.println(maxProfit(price));

    }
}
