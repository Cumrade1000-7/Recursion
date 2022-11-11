package Orgraph;

public class Main {
    public static void main(String[] args) {
        Orgraph orgraph = new Orgraph(7);
        orgraph.addEdge(0, 1);
        orgraph.addEdge(0, 3);
        orgraph.addEdge(1, 2);
        orgraph.addEdge(1, 3);
        orgraph.virusizeMem(orgraph, 0);
    }
}
