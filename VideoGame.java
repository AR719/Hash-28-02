import java.util.*;

public class VideoGame {
    public static void main(String[] args) {
        // Generate 100 random string IDs
        String[] ids = new String[100];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = generateRandomID();
        }
        
        // Store IDs in a hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        for (int i = 0; i < ids.length; i++) {
            hashtable.put(i, ids[i]);
        }
        
        // Store IDs in a queue
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < ids.length; i++) {
            queue.offer(ids[i]);
        }
        
        // Store IDs in an array
        String[] array = new String[ids.length];
        for (int i = 0; i < ids.length; i++) {
            array[i] = ids[i];
        }
        
        // Store IDs in a stack
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < ids.length; i++) {
            stack.push(ids[i]);
        }
        
        // Print out the contents of each data structure
        System.out.println("HAHSTABLE:");
        for (int i = 0; i < hashtable.size(); i++) {
            System.out.println(hashtable.get(i));
        }
        System.out.println();
        
        System.out.println("QUEUE:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();
        
        System.out.println("ARRAY:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        
        System.out.println("STACK:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    
    // Helper method to generate random string IDs
    public static String generateRandomID() {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        return sb.toString();
    }
}