package Module6.File;


public class IllegalStateException extends Exception {

        private int quantity;

    public int getQuantity() {
        return quantity;
    }
    public IllegalStateException(int quantity){
this.quantity=quantity;

    }
}
