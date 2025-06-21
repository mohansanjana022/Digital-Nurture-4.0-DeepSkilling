public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "T-Shirt", "Clothing"),

        };
        SearchUtils.sortByName(products);
        Product found1 = SearchUtils.linearSearch(products, "Shoes");
        Product found2 = SearchUtils.binarySearch(products, "Laptop");

        if (found1 != null) {
            System.out.println(found1.productName + " found (Linear) - ID: " + found1.productId + ", Category: " + found1.category);
        } else {
            System.out.println("Not Found (Linear)");
        }
        if (found2 != null) {
            System.out.println(found2.productName + " found (Binary) - ID: " + found2.productId + ", Category: " + found2.category);
        } else {
            System.out.println("Not Found (Binary)");
        }
    }
}
