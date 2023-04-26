public class Retailers {
    public static void main (String[] args) {
        String[] retailer = new String[5];
        retailer[0] = "Trader Joe's";
        retailer[1] = "Target";
        retailer[2] = "Wal-Mart";
        retailer[3] = "Amazon";
        String[] retailer2 = {
            "Trader Joe's",
            "Target",
            "Wal-Mart",
            "Amazon",
        };
        int len = retailer2.length;
        for(int i = 0; i < len; i++) {
            System.out.println("Retailer " + i + ": " + retailer2[i]);
        }
    }
}