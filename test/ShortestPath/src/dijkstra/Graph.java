package dijkstra;

import java.util.LinkedList;
//https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/

public class Graph {
	int numVertices;
	LinkedList<Edge> [] adjacencyList;
	
	public Graph(int numVertices) {
		this.numVertices = numVertices;
		this.adjacencyList = new LinkedList[numVertices];
		for (int i=0; i<numVertices; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
	}
	
	public void addEdge(int tail, int head, int weight) {
		Edge edge = new Edge (tail, head, weight);
		adjacencyList[tail].addFirst(edge);
	}
	
	public void printGraph(){
        for (int i=0; i<numVertices; i++) {
            LinkedList<Edge> list = adjacencyList[i];
            for (int j=0; j<list.size(); j++) {
            	System.out.println(i+"->"+list.get(j).getHead()+". Weight: "+list.get(j).getWeight());
            }
        }
    }
}
