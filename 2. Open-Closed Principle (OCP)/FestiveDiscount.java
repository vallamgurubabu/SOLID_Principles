class FestiveDiscount implements Discount {
    public double apply(double price) {
        return price * 0.9;
    }
}