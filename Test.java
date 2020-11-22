package ex0;

import java.util.TreeMap;

public class Test {

    public static void main(String[] args){
//        int a=10;
//        int b=3;
//        int c=88;
//        HashMap<String, Integer> happy= new HashMap<>();
//        System.out.println(happy.get("a"));
//        happy.remove("d");
//        System.out.println( happy);
//        happy.put("b",3);
//        happy.put("c",88);
//        happy.put("a",8);
//        //happy.remove("d");
//        System.out.println(happy);
//        happy=new HashMap<>();
//        System.out.println(happy);
        //System.out.println(happy.size());
        //System.out.println(happy.values());
        //happy.remove("d");
//        System.out.println(happy.get("c"));
//        HashMap<String, Integer> sad= new HashMap<String, Integer>();
//        for (String key: happy.keySet()) {
//            sad.put(key, happy.get(key));
//        }
//        System.out.println(sad);
//        sad.put("t",5);
//        System.out.println(happy);
//        System.out.println(sad);
//        happy.put("y",8);
//        System.out.println(happy);
//        System.out.println(sad);
//
//        System.out.println(sad);
//        System.out.println(sad.put("t",5));
//        System.out.println(sad);
//        System.out.println(happy);
//        happy.put("y",6);
//        System.out.println(happy);
//        System.out.println(sad);

        //test 1:
//        node_data aa = new NodeData();
//        node_data b = new NodeData();
//        System.out.println(aa.hasNi(b.getKey()));
//        aa.addNi(b);
//        System.out.println((b.getKey()));
//        System.out.println((aa.getKey()));
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        aa.removeNode(b);
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));

        //test 2:

//        node_data aa = new NodeData();
//        node_data b = new NodeData();
//        node_data c=new NodeData();
//        aa.toString();
//        System.out.println(aa.hasNi(b.getKey()));
//        aa.addNi(b);
//        System.out.println((b.getKey()));
//        System.out.println((aa.getKey()));
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        aa.removeNode(b);
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        graph test1=new Graph_DS();
//        test1.addNode(aa);
//        test1.addNode(b);
//
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        System.out.println(test1.getMC());
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        System.out.println(test1.getMC());
//        Graph_DS test2=new Graph_DS(test1);
//        test2.addNode(c);
//        for (node_data node:test1.getV()){
//            node.toString();
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("test2");
//
//        for (node_data node:test2.getV()){
//            node.toString();
//            System.out.println();
//        }

//        node_data aa = new NodeData();
//        node_data b = new NodeData();
//        System.out.println(aa.hasNi(b.getKey()));
//        aa.addNi(b);
//        System.out.println((b.getKey()));
//        System.out.println((aa.getKey()));
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        aa.removeNode(b);
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        graph test1=new Graph_DS();
//        test1.addNode(aa);
//        test1.addNode(b);
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        System.out.println(test1.getMC());
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        test1.removeNode(aa.getKey());
//        test1.removeNode(b.getKey());
//        System.out.println(test1.hasEdge(aa.getKey(), b.getKey()));
//        test1.getNode(50);
//        System.out.println(test1.getNode(50));
//        test1.addNode(aa);
//        test1.addNode(b);
//        test1.connect(aa.getKey(),b.getKey());
//        graph_algorithms algo=new Graph_Algo(test1);
//        System.out.println(algo.isConnected());
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(algo.isConnected());
//        node_data nodeforalgo1=new NodeData();
//        node_data nodeforalgo2=new NodeData();
//        test1.addNode(nodeforalgo1);
//        test1.addNode(nodeforalgo2);
//        test1.connect(nodeforalgo1.getKey(),nodeforalgo2.getKey());
//        test1.connect(nodeforalgo1.getKey(),aa.getKey());
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(algo.isConnected());
//        graph test2= new Graph_DS(test1);
//        System.out.println(test1.getMC());
//        System.out.println(test2.getMC());
//        test2.removeNode(aa.getKey());
//        algo.init(test2);
//        System.out.println(algo.isConnected());
//        algo.init(test1);
//        System.out.println(algo.isConnected());
//        System.out.println(test1.nodeSize());
//        System.out.println(test2.nodeSize());

//        node_data aa = new NodeData();
//        node_data b = new NodeData();
//        System.out.println(aa.hasNi(b.getKey()));
//        aa.addNi(b);
//        System.out.println((b.getKey()));
//        System.out.println((aa.getKey()));
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        aa.removeNode(b);
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        graph test1=new Graph_DS();
//        test1.addNode(aa);
//        test1.addNode(b);
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        System.out.println(test1.getMC());
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        test1.removeNode(aa.getKey());
//        test1.removeNode(b.getKey());
//        System.out.println(test1.hasEdge(aa.getKey(), b.getKey()));
//        test1.getNode(50);
//        System.out.println(test1.getNode(50));
//        test1.addNode(aa);
//        test1.addNode(b);
//        test1.connect(aa.getKey(),b.getKey());
//        graph_algorithms algo=new Graph_Algo(test1);
//        System.out.println(algo.isConnected());
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(algo.isConnected());
//        node_data nodeforalgo1=new NodeData();
//        node_data nodeforalgo2=new NodeData();
//        test1.addNode(nodeforalgo1);
//        test1.addNode(nodeforalgo2);
//        test1.connect(nodeforalgo1.getKey(),nodeforalgo2.getKey());
//        test1.connect(nodeforalgo1.getKey(),aa.getKey());
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(algo.isConnected());
//        graph test2= new Graph_DS(test1);
//        System.out.println(algo.isConnected());
//        System.out.println(test1.getMC());
//        System.out.println(test2.getMC());
//        test2.removeNode(aa.getKey());
//        algo.init(test2);
//        System.out.println(algo.isConnected());
//        algo.init(test1);
//        System.out.println(algo.isConnected());
//        System.out.println(test1.nodeSize());
//        System.out.println(test2.nodeSize());

//        node_data or=new NodeData();
//        node_data nofar=new NodeData();
//        System.out.println(or.getNi());
//        node_data a=new NodeData(or);
//        or.addNi(nofar);
//        System.out.println(or.getNi());
//        System.out.println(nofar.getNi());
//        System.out.println("**********8");
//        System.out.println(a.getNi());

//        ArrayList<Integer> array=new ArrayList<Integer>();
//        array.trimToSize();
//        array.add(5,0);
//        System.out.println(array.get(5));
//        array.add(5);
//        array.add(6);
//        System.out.println(array.get(0));
//        array.add(7);
//        array.remove(0);
//        System.out.println(array.get(0));

//        node_data aa = new NodeData();
//        node_data b = new NodeData();
//        System.out.println(aa.hasNi(b.getKey()));
//        aa.addNi(b);
//        System.out.println((b.getKey()));
//        System.out.println((aa.getKey()));
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        aa.removeNode(b);
//        System.out.println(aa.hasNi(b.getKey()));
//        System.out.println(b.hasNi(aa.getKey()));
//        graph test1=new Graph_DS();
//        test1.addNode(aa);
//        test1.addNode(b);
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        System.out.println(test1.getMC());
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(test1.edgeSize());
//        test1.removeNode(aa.getKey());
//        test1.removeNode(b.getKey());
//        System.out.println(test1.hasEdge(aa.getKey(), b.getKey()));
//        test1.getNode(50);
//        System.out.println(test1.getNode(50));
//        test1.addNode(aa);
//        test1.addNode(b);
//        test1.connect(aa.getKey(),b.getKey());
//        graph_algorithms algo=new Graph_Algo(test1);
//        System.out.println(algo.isConnected()+"****");
//        test1.removeEdge(aa.getKey(),b.getKey());
//        System.out.println(algo.isConnected());
//        node_data nodeforalgo1=new NodeData();
//        node_data nodeforalgo2=new NodeData();
//        test1.addNode(nodeforalgo1);
//        test1.addNode(nodeforalgo2);
//        test1.connect(nodeforalgo1.getKey(),nodeforalgo2.getKey());
//        test1.connect(nodeforalgo1.getKey(),aa.getKey());
//        test1.connect(aa.getKey(),b.getKey());
//        System.out.println(algo.isConnected());
//        graph test2= new Graph_DS(test1);
//        System.out.println(algo.isConnected());
//        System.out.println(test1.getMC());
//        System.out.println(test2.getMC());
//        test2.removeNode(aa.getKey());
//        algo.init(test2);
//        System.out.println(algo.isConnected());
//        algo.init(test1);
//        System.out.println(algo.isConnected());
//        System.out.println(test1.nodeSize());
//        System.out.println(test2.nodeSize());



//        HashMap<Integer, HashMap<Integer, Double>> no=new HashMap<>();
//        no.put(5,new HashMap<Integer, Double>());
//        no.get(5).put(3, (double) 2);
//        System.out.println(no);
//        no.get(5).put(3,6.0);
//        System.out.println(no);

        TreeMap<Integer,Double> ma=new TreeMap<Integer, Double>();
        ma.put(5,5.5);
        System.out.println(ma);
        ma.put(4,(double)6);
        System.out.println(ma);
        ma.replace(5,6.0);
        ma.put(4,6.0);
        System.out.println(ma);
//        Double d=ma.get(5);
//
//        System.out.println(ma);
//         Map.Entry key = ma.firstEntry();
//        System.out.println(key.getKey());










    }


    public static void array(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);

        }


    }


    //graph_algorithms ga=new Graph_Algo();




}
