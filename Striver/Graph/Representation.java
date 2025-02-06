import java.util.*;
public class Representation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        //graph is gettign stored in a matrix here ... takes too much space!
        // int[][] adj = new int[n+1][m+1];
        // for(int i=0;i<m;i++){
        //     int u = scn.nextInt();
        //     int v = scn.nextInt();
        //     adj[u][v]=1;
        //     adj[v][u]=1;
        // }
        //--------------------------------------------------------------------------------------------------------------------------------
        List<List<Integer>> adj = new ArrayList<>();
        //populating an empty list
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

    }
}
