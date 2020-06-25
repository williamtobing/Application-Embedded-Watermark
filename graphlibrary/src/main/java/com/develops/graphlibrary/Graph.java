package com.develops.graphlibrary;

import java.util.LinkedList;

public class Graph
{
    private static int V; // No. of vertices
    private static LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    public Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    public static void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    public LinkedList<Integer> [] getAdjacencyList()
    {
        return adj;
    }

}

