public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }




    public int max() {
        int max = -1;
        for (int sale : sales) {
            //for(int i=0; i < sales.lenght; i++) int sale = sales[i];
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
