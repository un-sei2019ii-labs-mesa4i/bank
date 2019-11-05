package dijkstra;

import java.util.LinkedList;

public class Test {
	private static String getShortestPath(Graph graph) {
		int i_1=0, i_2=0;
		int sum=0;
		int node=0;
		int weight=Integer.MAX_VALUE;
		String path = "";
		while (i_1<graph.numVertices) {
			LinkedList<Edge> list = graph.adjacencyList[i_1];
			i_2=i_1;
			for (int j=0; j<list.size(); j++) {
				if (list.get(j).getWeight()<weight) {
					weight = list.get(j).getWeight();
					node = list.get(j).getHead();
					i_1=node;
				}
            }
			sum+=weight;
			path.concat(i_2+"-");
        }
		path.concat(". Weight="+sum);
		return path;
	}
	
	private static Graph addEdges(Graph graph) {
		graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        return graph;
	}

	public static void main(String[] args) {
		int vertices = 6;
        Graph graph = new Graph(vertices);
        graph = addEdges(graph);
        String path = getShortestPath(graph);
        System.out.println(path);
	}
}
