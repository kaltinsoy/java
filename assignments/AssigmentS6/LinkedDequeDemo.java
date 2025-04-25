public class LinkedDequeDemo {
    public static void main(String[] args) {
        // Create a new LinkedDeque
        LinkedDeque<String> deque = new LinkedDeque<>();
        
        System.out.println("=== Testing LinkedDeque Operations ===");
        System.out.println("Initial deque is empty: " + deque.isEmpty());
        
        // Add elements to front and back
        System.out.println("\nAdding elements to front and back:");
        deque.addToFront("Front 1");
        deque.addToBack("Back 1");
        deque.addToFront("Front 2");
        deque.addToBack("Back 2");
        
        // Display front and back
        System.out.println("Front element: " + deque.getFront());
        System.out.println("Back element: " + deque.getBack());
        
        // Remove elements
        System.out.println("\nRemoving elements:");
        System.out.println("Removed from front: " + deque.removeFront());
        System.out.println("Removed from back: " + deque.removeBack());
        
        // Display again
        System.out.println("\nAfter removal:");
        System.out.println("Front element: " + deque.getFront());
        System.out.println("Back element: " + deque.getBack());
        
        // Test isEmpty
        System.out.println("\nDeque is empty: " + deque.isEmpty());
        
        // Clear the deque
        System.out.println("\nClearing the deque...");
        deque.clear();
        System.out.println("Deque is empty after clear: " + deque.isEmpty());
        
        // Test exception handling
        System.out.println("\nTesting exception handling:");
        try {
            System.out.println("Attempting to get front of empty deque...");
            System.out.println(deque.getFront());
        } catch (EmptyQueueException e) {
            System.out.println("Caught EmptyQueueException: " + e.getMessage());
        }
        
        try {
            System.out.println("Attempting to remove from back of empty deque...");
            System.out.println(deque.removeBack());
        } catch (EmptyQueueException e) {
            System.out.println("Caught EmptyQueueException: " + e.getMessage());
        }
    }
}