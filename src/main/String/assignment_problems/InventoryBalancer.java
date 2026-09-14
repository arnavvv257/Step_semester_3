public class InventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        
        int maxQuantity = -1;
        String maxSection = "";
        int maxItemIndex = -1;

        // Process Section A
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > maxQuantity) {
                maxQuantity = sectionA[i];
                maxSection = "Section A";
                maxItemIndex = i + 1; // 1-based index for output
            }
        }

        // Process Section B
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            // If there's a tie, this keeps the first found (Section A). 
            // Change to >= if Section B should take priority on ties.
            if (sectionB[i] > maxQuantity) { 
                maxQuantity = sectionB[i];
                maxSection = "Section B";
                maxItemIndex = i + 1; // 1-based index for output
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | ", totalA, totalB, status);
        System.out.printf("Highest Quantity: %d (%s, Item %d)\n", maxQuantity, maxSection, maxItemIndex);
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        
        analyzeInventory(sectionA, sectionB);
    }
}