public class filterproduct {
    public void filterproducts(String category)
    {
        System.out.println(category);
    }
    public void filterproducts(double minprice, double maxprice)
    {
       System.out.println(minprice + maxprice);
    }
    public void filterproductsbybrand(String brand)
    {
        System.out.println(brand);
    }
    public void filterproducts(String category,double minprice, double maxprice)
    {
        System.out.println(category + minprice + maxprice);
    }
    public void filterproducts(String category,double minprice, double maxprice,String brand)
    {
        System.out.println(category + minprice +maxprice + brand);
    }
    public static void main(String args[])
    {
        filterproduct filter= new filterproduct();

        filter.filterproducts("Electronics");
        filter.filterproducts(100, 500);
        filter.filterproductsbybrand("Apple");
        filter.filterproducts("Fashion", 50, 200);
        filter.filterproducts("Electronics", 300, 1000, "Sony");
    }
}
