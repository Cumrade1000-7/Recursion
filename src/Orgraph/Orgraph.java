package Orgraph;

import java.util.ArrayList;
import java.util.List;

public class Orgraph {
    int vertices;

    public Orgraph (int vertices) {
        this.vertices = vertices;
    }

    List<List<Integer>> verticesInfo = new ArrayList<>();

    public void addEdge (int a, int b) {
        if (verticesInfo.isEmpty()){
            for (int i = 0; i < vertices; i++) {
                verticesInfo.add(new ArrayList<>());
            }
        }
        verticesInfo.get(a).add(b);
    }

    public void virusizeMem (Orgraph orgraph, int startUser) {

        boolean[] visited = new boolean [vertices];
        boolean[] addedToQueue = new boolean[vertices];
        SimpleQueue<Integer> sent = new SimpleQueue<Integer>();
        int lastViewer = 0;

        sent.add(startUser);

        while (!sent.isEmpty()) {
            lastViewer = sent.remove();

            if (!visited[lastViewer]) {
                visited[lastViewer] = true;
                for (int i : verticesInfo.get(lastViewer)) {
                    if (!addedToQueue[i]) {
                        sent.add(i);
                        addedToQueue[i] = true;
                    }
                }
            }
        }
        System.out.println(lastViewer);
    }
}
