public class Main {


    public static void main(String[] args) {
        int[] sales = {10, 15, 20,25};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());


    }
}
