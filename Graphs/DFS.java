import java.util.*;
public class Graph{
    int v;
    LinkedList<Integer> adj[];
     Graph(int V) {
         v = V;
         adj = new LinkedList[v];
         for(int i=0;i<v;i++){
             adj[i] = new LinkedList();
         }
     }
     
     public void addEdge(int v, int w) {
         adj[v].add(w);
     }
     void DFS(int s) {
         boolean visited[] = new boolean[v];
         
         DFSUtil(s, visited);
     }
     void DFSUtil(int s, boolean visited[]) {
         visited[s] = true;
         System.out.println(s+ " ");
         Iterator<Integer> i = adj[s].listIterator();
         while(i.hasNext()) {
                int n = i.next();
                if(!visited[n]) {
                   DFSUtil(n,visited);
                }
         }
     }
     public static void main(String []args){
        Graph g = new Graph(4);
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        g.DFS(2);
  
     }
}
