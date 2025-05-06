class NoDiscount implements Discount {
    public double apply(double price) {
        return price;
    }
}