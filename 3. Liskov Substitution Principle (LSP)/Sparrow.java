class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Bad example for LSP - should not override fly with an exception
// class Ostrich extends Bird {
//     @Override
//     public void fly() {
//         throw new UnsupportedOperationException("Ostriches can't fly!");
//     }
// }