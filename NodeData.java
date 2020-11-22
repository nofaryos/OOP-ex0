package ex0;

import java.util.Collection;
import java.util.HashMap;

/**
 * This class implements the interface of node_data.
 * NodeData (vertex) in an (undirectional) unweighted graph.
 * Each vertex has an identity number(key), color(info), list of neighbors and a distance(tag)
 * that represents it in a particular graph
 */

public class NodeData implements node_data {

    private int key;
    private  int tag;
    private String info;
    private static int keyCount = 0;
    private HashMap<Integer, node_data> neighbors;

    /**
     * Constructor to create a new node
     */
    public NodeData(){
        this.key = keyCount;
        keyCount++;
        this.tag = -1;
        this.info = "white";
        neighbors = new HashMap<Integer, node_data>();
    }

    /**
     * A copy constructor.
     * @param -node_data
     */
    protected NodeData(node_data node){
        if (!(node==null)) {
            this.key = node.getKey();
            this.setInfo(node.getInfo());
            this.setTag(node.getTag());
            neighbors = new HashMap<Integer, node_data>();
        }
    }

    @Override
    /**
     * Return this node key
     * @return- int key
     */
    //Return this node key:
    public int getKey() {
        return this.key;
    }

    @Override
    /**
     * Return this node neighbors.
     * @return- Collection<node_data>
     */
    public Collection<node_data> getNi() {
        return this.neighbors.values();
    }

    @Override
    /**
     * Return true iff this<==>key are adjacent, as an edge between them.
     * @return- true/false.
     */
    public boolean hasNi(int key) {
        return this.neighbors.containsKey(key);
    }

    @Override
    /**
     * Adds the node_data (t) to this node_data neighbors.
     * @param-node_data t
     */
    public void addNi(node_data t) {
        neighbors.put(t.getKey(),t);
        if (!(t.hasNi(this.key))){
            t.addNi(this);
        }
    }

    @Override
    /**
     * Removes the node_data (t) from this node_data neighbors.
     * @param-node_data t
     */
    public void removeNode(node_data node) {
        neighbors.remove(node.getKey());
        if (node.hasNi(this.key)){
            node.removeNode(this);
        }
    }

    @Override
    /**
     * Return this node info.
     * @return-String info
     */
    public String getInfo() {
        return this.info;
    }

    @Override
    /**
     * Setting this node info.
     * @param-String s
     */
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    /**
     * Return this node tag.
     * @return-int tag
     */
    public int getTag() {
        return this.tag;
    }

    @Override
    /**
     * Setting this node tag.
     * @param- int t.
     */
    public void setTag(int t) {
        this.tag = t;
    }

    //Print function:
    public String toString() {
        return " Key: " +  this.getKey() + ": Tag: " +this.getTag() + ", Info: " + this.getInfo();
    }
}
