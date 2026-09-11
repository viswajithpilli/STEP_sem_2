public class WarehouseInventoryBalancer {
    public void analyzeInventory(int[] sectionA, int[] sectionB) {
        int sumA = 0;
        int sumB = 0;
        int maxQty = -1;
        String maxSection = "";
        int maxItem = -1;
        
        for (int i = 0; i < sectionA.length; i++) {
            sumA += sectionA[i];
            if (sectionA[i] > maxQty) {
                maxQty = sectionA[i];
                maxSection = "Section A";
                maxItem = i + 1;
            }
        }
        
        for (int i = 0; i < sectionB.length; i++) {
            sumB += sectionB[i];
            if (sectionB[i] > maxQty) {
                maxQty = sectionB[i];
                maxSection = "Section B";
                maxItem = i + 1;
            }
        }
        
        String status = (sumA == sumB) ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + sumA + " | Section B Total: " + sumB + " | Status: " + status + " | Highest Quantity: " + maxQty + " (" + maxSection + ", Item " + maxItem + ")");
    }
}
