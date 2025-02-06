package G22.Graph;

import java.util.*;
public class EdgeList {

    static Map<String, List<String>> graph;
    static void create(String[][] edges){
        graph = new HashMap<>();
        for(String[] edge: edges){
            if(!graph.containsKey(edge[0])){
                graph.put(edge[0],new ArrayList<>());
            }
            graph.get(edge[0]).add(edge[1]);
        
            if(!graph.containsKey(edge[1])){
                graph.put(edge[1],new ArrayList<>());
            }
            graph.get(edge[1]).add(edge[0]);
        }
    }
    public static void main(String[] args) {
        String[][] edges = new String[][]{
            {"B","M"},
            {"B","J"},
            {"B","R"},
            {"R","C"},
            {"M","C"},
            {"J","R"}
        };
        create(edges);
        for(Map.Entry<String, List<String>> entry: graph.entrySet()){
            System.out.print(entry.getKey()+" : ");
            System.out.println(entry.getValue());
        }
    }
}
