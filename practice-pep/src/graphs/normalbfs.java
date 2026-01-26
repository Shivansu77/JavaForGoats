package graphs;

import java.util.*;
class normalbfs {
    int V;
    List<Integer>[] adj;
    normalbfs(int V){
        this.V=V;
        adj=new ArrayList[V];
        for(int i=0; i<V; i++) adj[i] = new ArrayList<>();
    }
    void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    void bfs(int src){
        boolean[]vis = new boolean[V];
        Queue<Integer> q =new LinkedList<>();
        vis[src]=true;
        q.add(src);

        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:adj[u]){
                if(!vis[v]){
                    vis[v]=true;
                    q.add(v);
                }
            }
            System.out.println();
        }

    }

}

class  Main{
    static void main(String[] args) {
        normalbfs g = new normalbfs(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,5);
        g.bfs(0);
    }
}
