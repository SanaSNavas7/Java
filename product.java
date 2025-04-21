class product {
    int product_code;
    String product_name;
    double product_price;

    product(int product_code, String product_name, double product_price) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.product_price = product_price;

    }

    public static void main(String[] args) {

        product p1 = new product(1, "chair", 12000);
        product p2 = new product(2, "chair1", 3000);
        product p3 = new product(3, "chair2", 4000);
        if (p1.product_price < p2.product_price) {
            if (p1.product_price < p3.product_price) {

                System.out.println("Smaller is " + p1.product_name);

            } else {

                System.out.println("Smaller is" + p3.product_name);
            }
        } else {
            System.out.println("Smaller is" + p2.product_name);

        }
    }
}
