

 

import java.util.ArrayList; 

import java.util.Arrays; 

import java.util.List; 

 

public class dfsmain { 

    public static void main(String[] args) { 

        int n =6; 

        int[][] edges = new int[][]{{0,1},{0,2},{1,2},{1,3},{1,4},{2,5},{3,4},{3,5}}; 

        int src =0; 

        List<Integer> dfs= dfs(edges, n, src); 

        System.out.println(dfs); 

    } 

 

    private static List<Integer> dfs(int[][] edges, int n, int src) { 

        List<Integer> dfs = new ArrayList<>(n); 

        boolean[] visited = new boolean[n]; 

        List<List<Integer>> graph = build(edges, n); 

        filldfs(graph,dfs,visited,src); 

        return dfs; 

    } 

 

    private static void filldfs(List<List<Integer>> graph, List<Integer> dfs, boolean[] visited, int src) { 

        dfs.add(src); 

        visited[src]=true; 

        for(int nbr: graph.get(src)) 

        { 

            if(!visited[nbr]) 

            { 

                filldfs(graph,dfs, visited,nbr); 

            } 

        } 

    } 

 

    private static List<List<Integer>> build(int[][] edges, int n) { 

        List<List<Integer>> graph = new ArrayList<>(); 

        for(int i = 0; i<n;i++) 

        { 

            graph.add(new ArrayList<>()); 

        } 

        for(int[] edge : edges) 

        { 

            graph.get(edge[0]).add(edge[1]); 

            graph.get(edge[1]).add(edge[0]); 

        } 

        return graph; 

    } 

} 