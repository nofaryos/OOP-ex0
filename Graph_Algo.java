package ex0;

import java.util.ArrayList;
import java.util.List;

public class Graph_Algo implements graph_algorithms {

    /**
     * This class implements the interface of graph_algorithms.
     *The class includes a number of algorithms that run on graphs.
     */

    private graph gr;

    /**
     * Constructor to create a new Graph_Algo:
     */
    public Graph_Algo(){
        this.gr = new Graph_DS();
    }

    @Override
    /**
     *  Keeping a vote in memory to the graph on which this set of algorithms operates on.
     * @param graph
     */

    public void init(graph g) {
        this.gr = g;
    }

    @Override
    /**
     *   A deep copy of this graph-
     *   Using copy constructors of NodeData and Graph_DS.
     * @return graph
     */
    public graph copy() {
        graph g = new Graph_DS(this.gr);
        return g;
    }

    /**
     * BFS algorithm is scanning this graph using the tag and info of each node in the graph,
     * tart scanning the graph from the vertex identified with key.
     *Using this algorithm it is possible to determine whether the graph is connected -If the graph has a vertex whose tag
     * is infinite or whose info is white, it means that the graph is not a connected.
     * In addition, distances between vertices in the graph can be found using this algorithm.
     * @param key
     * @return true/false
     */
    private boolean BFS(int key){
        //Update the distance(tag) of each vertex to infinity and color(info) all the vertices in white.
        //White vertex - means we have not visited it yet.
        for (node_data n:gr.getV()) {
            n.setTag(Integer.MAX_VALUE);
            n.setInfo("White");
        }
        //Update the vertex color from which we will start scanning the graph to gray and
        //update it distance to 0-the distance between vertex itself is 0.
        // Gray color - means we visited it but still did not take care of all his neighbors
        gr.getNode(key).setInfo("Gray");
        gr.getNode(key).setTag(0);
        ArrayList<node_data> array = new ArrayList<node_data>();
        array.add(gr.getNode(key));
        //A loop that goes through all the vertices in the graph.
        while (array.size() != 0) {
            node_data n = array.get(0);
            //A loop that passes through all the neighbors of vertex.
            for (node_data nN : n.getNi()) {
                if (nN.getInfo().equals("White")) {
                    nN.setInfo("Gray");
                    nN.setTag(Math.min(nN.getTag(), n.getTag() + 1)); //Update the min distances of the neighbors from the vertex
                    array.add(nN);
                }
            }
            n.setInfo("Black"); //Update the vertex color to black after we have taken care of all of its neighbors.
            array.remove(0);
        }
        //Check if the graph is connected, that is,
        //check if there are any vertices that we did not reach (white vertices)
        for (node_data node : gr.getV()) {
            if (node.getInfo() .equals("White")) {
                return false;
            }
        }
        return true;
    }

    @Override
    /**
     * Returns true if there is a valid path from EVREY node to each other node.
     * @return true/false.
     */
    public boolean isConnected(){
        //An empty graph or a graph that contains a single vertex is connected
        if (gr.nodeSize() == 0 || gr.nodeSize() == 1) {
            return true;
        }
        int key = 0;
        //Finding a vertex in the graph-when we know the graph is not empty
        for (node_data node:gr.getV()) {
            key = node.getKey();
            break;
        }
        //Run the BFS algorithm to check if the graph is connected
        //
        return BFS(key);
    }

    @Override
    /**
     *Finds the shortest path between src to dest.
     * @param -int src- start node
     * @param -int dest- end node
     * @return int distance
     *  returns -1 if no such path
     */
    public int shortestPathDist(int src, int dest) {
        if (gr.getNode(src) != null && gr.getNode(dest) != null){
            //The distance between the vertex itself is 0
            if (src == dest){
                return 0;
            }
            BFS(src);
            //If the distance of dest different from infinitely,
            // we will return its distance from the vertex from which we scanned the graph(src)
            if (gr.getNode(dest).getTag() != Integer.MAX_VALUE){
                return gr.getNode(dest).getTag();
            }
        }
        //If there is no path between the two vertices we will return -1
        return -1;
    }

    @Override
    /**
     *Returns the shortest path between src to dest - as an array List of nodes:
     * @param -int src- start node
     * @param -int dest- end node
     * @return ArrayList<node_data>
     */
    public List<node_data> shortestPath(int src, int dest) {
        ArrayList<node_data> array = new ArrayList<node_data>();
        //The distance between the two vertices
        int dis = shortestPathDist(dest, src);
        //There is no path between the two vertices
        if (dis == -1) {
            return array;
        }
        //A path between a vertex and itself
        if (dis == 0){
            array.add(gr.getNode(src));
            return array; }
        //Keeping the vertices in the path, starting from the beginning of the path
        array.add(gr.getNode(src));
        node_data n = gr.getNode(src);
        for (int i = 0; i < gr.getNode(src).getTag(); i++) {
            for (node_data node: n.getNi()) {
                if (node.getTag() == n.getTag()-1){
                    array.add(node);
                    n = node;
                    break;
                }
            }
        }
        return array;
    }
}
