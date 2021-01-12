import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> scannableItems;

    public Wallet(String name) {
        this.name = name;
        this.scannableItems = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.scannableItems.size();
    }

    public void addItem(IScan item) {
        this.scannableItems.add(item);
    }
}
