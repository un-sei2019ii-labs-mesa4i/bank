package dijkstra;

public class Edge {
	private int tail;
    private int head;
    private int weight;

    public Edge(int tail, int head, int weight) {
        this.tail = tail;
        this.head = head;
        this.weight = weight;
    }

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
