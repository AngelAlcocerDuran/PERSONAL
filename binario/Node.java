
package binario;

public class Node {
    private int data;
    private Node nextIzq, nextDer;

    public Node() {
    }

    public Node(int data, Node nextIzq, Node nextDer) {
        this.data = data;
        this.nextIzq = nextIzq;
        this.nextDer = nextDer;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextIzq() {
        return nextIzq;
    }

    public void setNextIzq(Node nextIzq) {
        this.nextIzq = nextIzq;
    }

    public Node getNextDer() {
        return nextDer;
    }

    public void setNextDer(Node nextDer) {
        this.nextDer = nextDer;
    }
    
    
}
