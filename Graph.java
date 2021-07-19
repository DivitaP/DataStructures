import java.util.*;

public class Graph {
    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int a) {
        adj[v].add(a);
    }

    void BFS(int s) {// using linkedlist as queue

        boolean[] vis = new boolean[V];
        LinkedList<Integer> q = new LinkedList<Integer>();

        vis[s] = true;
        q.add(s);

        while (q.size() != 0) {
            s = q.poll(); // inbuilt method to deque from LinkedList
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator(); // to create iteration of list
            while (i.hasNext()) { // acts as next null checker
                int n = i.next(); // next element in adj list
                if (!vis[n]) {

                    vis[n] = true;
                    q.add(n);
                }
            }
        }
    }

    void initDFS(int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                initDFS(n, visited);
        }

    }

    void rDFS(int s) { // Recursive DFS algo
        boolean vis[] = new boolean[V];

        initDFS(s, vis);

    }

    void iDFS(int s) { // Iterative DFS algo (using stack)
        Vector<Boolean> vis = new Vector<Boolean>(V);
        for (int i = 0; i < V; ++i) {
            vis.add(false);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (stack.empty() == false) {
            s = stack.peek();
            stack.pop();

            if (vis.get(s) == false) {
                System.out.print(s + " ");
                vis.set(s, true);
            }

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!vis.get(n))
                    stack.push(n);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.println("BFS Iterative:");
        g.BFS(0);
        System.out.println("\nDFS Recursive");
        g.rDFS(0);
        System.out.println("\nDFS Iterative");
        g.iDFS(0);
        System.out.println();
    }

}
/*
        0
      /   \
    1      2
    |  \    |
    |     \ |
    3-------4  
      \    /
        5
Divitas-MacBook-Air:java divita$ java Graph
BFS Iterative:
0 1 2 3 4 5 
DFS Recursive
0 1 3 4 5 2 
DFS Iterative
0 2 4 5 1 3 
*/