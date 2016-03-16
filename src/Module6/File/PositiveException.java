package module6.File;


public class PositiveException extends Exception {

        private int quantity;

    public int getQuantity() {
        return quantity;
    }
    public PositiveException(int quantity){
    this.quantity=quantity;

    }
}
