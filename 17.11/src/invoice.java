class Invoice {
    private int partNumber;
    private String partDescryption;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescryption, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescryption = partDescryption;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescryption() {
        return partDescryption;
    }

    public void setPartDescryption(String partDescryption) {
        this.partDescryption = partDescryption;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice [partNumber=" + partNumber + ", partDescryption=" + partDescryption + ", quantity=" + quantity
                + ", price=" + price + "]";
    }
}
