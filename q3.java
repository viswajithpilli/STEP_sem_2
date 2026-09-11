public class InventoryCsvParser {
    public void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        
        if (fields.length == 3) {
            System.out.println("Product: " + fields[0] + " | SKU: " + fields[1] + " | Qty: " + fields[2]);
        } else {
            System.out.println("Invalid Record");
        }
    }
}
