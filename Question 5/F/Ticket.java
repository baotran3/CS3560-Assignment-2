class Ticket implements SaleableItem {
    @Override
    public void sellCopy() {
        System.out.println("Selling a ticket");
    }
}