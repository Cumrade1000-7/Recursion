package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
    int v;
    public Graph (int v) {
        this.v = v;
    }
    
    List<List<Integer>> verticesInfo = new ArrayList<>();

    public void addEdge (int a, int b) {
        if (verticesInfo.isEmpty()){
            for (int i = 0; i < v; i++) {
                verticesInfo.add(new ArrayList<>());
            }
        }
        verticesInfo.get(a).add(b);
        verticesInfo.get(b).add(a);
    }

    public List<Integer> adjacent (int v) {
        return verticesInfo.get(v);
    }

    public List<Integer> vertices () {
        List<Integer> ver = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            ver.add(i);
        }
        return ver;
    }

    public int size () {
        return v;
    }

    public void calcPath (Graph graph) {
        List<Integer> markSizes = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            int[] visited = new int[v];
                int size = dfs(graph, i, visited);
                markSizes.add(size);
        }
        int[] answer = new int[v];
        for (int i = 0; i < v; i++) {
            answer[i] = markSizes.get(i) - 1;
        }
        System.out.println(Arrays.toString(answer));
    }

    public int dfs (Graph graph, int v, int[] visited) {
        visited[v] = 1;
        int size = 1;
        for (int i : graph.adjacent(v)) {
            if (visited[i] == 0) {
                size += dfs(graph, i, visited);
            }
        }
        return size;
    }
}
