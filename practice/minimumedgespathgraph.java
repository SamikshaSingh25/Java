import java.util.*;

class minimumedgespathgraph {
    // Function to find the minimum number of edges
    static int findMinEdges(int n) {
        if (n == 1) return 0; // Already at vertex 1, no edges needed
        
        // BFS setup
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.offer(new int[]{1, 0}); // {current vertex, edge count}
        visited.add(1);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int vertex = current[0];
            int edges = current[1];
            
            // Generate neighbors
            int neighbor1 = vertex + 1;
            int neighbor2 = vertex * 3;
            
            // Check neighbors
            if (neighbor1 == n || neighbor2 == n) {
                return edges + 1;
            }
            
            if (!visited.contains(neighbor1) && neighbor1 <= n) {
                queue.offer(new int[]{neighbor1, edges + 1});
                visited.add(neighbor1);
            }
            
            if (!visited.contains(neighbor2) && neighbor2 <= n) {
                queue.offer(new int[]{neighbor2, edges + 1});
                visited.add(neighbor2);
            }
        }
        
        return -1; // This should never happen
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of test cases
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(); // Target vertex
            System.out.println(findMinEdges(n));
        }
        sc.close();
    }
}
