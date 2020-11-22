package ex0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * This class implements the interface of graph.
 * This class describes an offline graph.
 * Each graph has a list of vertices, number of edges and mode count.
 */

public class Graph_DS  implements graph {

    private HashMap<Integer, node_data> vertices;
    private int mc;
    private int edges;

    /**
     *  Constructor to create a new graph:
     */
    public Graph_DS(){
        this.mc = 0;
        this.edges = 0;
        vertices = new HashMap<Integer, node_data>();
    }

    /**
     * A copy constructor.
     * @param -graph g
     */
    public Graph_DS (graph g){
        this.vertices = new HashMap<Integer, node_data>();
        //Copy the vertices
        for (node_data node : g.getV()) {
            this.addNode(new NodeData(node));
            //A connection between a vertex and all its neighbors
            for (node_data nodeN : node.getNi()) {
                this.connect(nodeN.getKey(), node.getKey());
            }
        }
            this.mc = g.getMC();
            this.edges = g.edgeSize();
    }

    @Override
    /**
     * Return the vertex identified by the key
     * @param- int key
     * @return- node_data
     */
    public node_data getNode(int key) {
        return vertices.get(key);
    }

    @Override
    /**
     * Return true if there is a edge between the node with key node1 to the node w1th key node2.
     * @param- int node1
     * @param- int node2
     * @return- true/false
     */
    public boolean hasEdge(int node1, int node2) {
        if (vertices.containsKey(node1)) { //Check if the vertex with key node1 is contained in the graph
            return getNode(node1).hasNi(node2);
        }
        return false;
    }

    @Override
    /**
     * Add node_data n to the graph.
     * @param- node_data n.
     */
    public void addNode(node_data n) {
        vertices.put(n.getKey(),n);
        this.mc++;
    }

    @Override
    /**
     * Connection between the node with key node1 and the node w1th key node2.
     * @param- int node1
     * @param- int node2
     */
    public void connect(int node1, int node2) {
        //Check if the two vertices are contained in the graph
        if (vertices.containsKey(node1) && vertices.containsKey(node2) ) {
            //If it is two different vertices that are not neighbors we will connect them
            if (!(getNode(node1).hasNi(node2)) && node1 != node2) {
                getNode(node1).addNi(getNode(node2));
               this.mc++;
                this.edges++;
            }
        }
    }

    @Override
    /**
     * Return the vertices in this graph
     * @return collection<node_data>
     */
    public Collection<node_data> getV() {
        return vertices.values();
    }

    @Override
    /**
     * Return the list neighbors of the node with id key
     * @param -int node id
     * @return collection<node_data>
     */
    public Collection<node_data> getV(int node_id) {
        return getNode(node_id).getNi();
    }

    @Override
    /**
     * Removing a vertex from the graph
     * @param- int key
     * @return -the node data that we removed
     */
    public node_data removeNode(int key) {
        if (vertices.containsKey(key)){
            //Save the vertex we want to delete
            node_data temp = getNode(key);
            if (temp.getNi().size() != 0){
                ArrayList<node_data> array = new ArrayList<node_data>(temp.getNi().size());
                //Keeping the neighbors of the vertex in a dynamic array
                for (node_data node : temp.getNi()) {
                    array.add(node);
                }
                //Deleting the vertex's neighbors
                for (int i = 0; i < array.size(); i++) {
                    temp.removeNode(array.get(i));
                   this.mc++;
                    this.edges--;
                }
            }
            vertices.remove(key);
            this.mc++;
            return temp;
        }
        return null;
    }

    @Override
    /**
     * Removing a edge between the node with key node1 and the node w1th key node2.
     * @param- int node1
     * @param- int node2
     */
    public void removeEdge(int node1, int node2) {
        //Check if the two vertices are contained in the graph
        if (vertices.containsKey(node1) && vertices.containsKey(node2)){
            //Check if there is a edge between the two vertices
            if (hasEdge(node1,node2)){
                getNode(node1).removeNode(getNode(node2));
                this.edges--;
                this.mc++;
            }
        }
    }

    @Override
    /**
     * Return the number of vertices in the graph.
     * @return-int, the number of vertices.
     */
    public int nodeSize() {
        return vertices.size();
    }

    @Override
    /**
     * Return the number of edges in the graph
     * @return-int, edges.
     */
    public int edgeSize() {
        return this.edges;
    }

    @Override
    /**
     * Return the mode count
     * @return-int, MC.
     */
    public int getMC() {
        return this.mc;
    }

    //Print function:
    public void toStringG(){
        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).toString();
        }
    }
}
