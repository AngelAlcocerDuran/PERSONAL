
package binario;

public class ArbolRecursivo {

    private Node raiz;
    private int nivel = 0;

    public void add(int data, Node node, Node tmp) {
        if (node == null) {
            node = new Node(data, null, null);
            add(data, node, raiz);
        } else {
            if (raiz == null) {
                System.out.println("--- [ NEW TREE ROOT CREATED: \"" + data + "\" ] ---");
                raiz = node;
            } else {
                boolean flag = false;
                if (data > tmp.getData()) {
                    if (tmp.getNextDer() == null) {
                        System.out.println("\n--- [ RIGTH INSERTING: \"" + data + "\" ] ---");
                        tmp.setNextDer(node);
                        flag = true;
                    } else {
                        add(data, node, tmp.getNextDer());
                    }
                } else if (data < tmp.getData()) {
                    if (tmp.getNextIzq() == null) {
                        System.out.println("\n--- [ LEFT INSERTING: \"" + data + "\" ] ---");
                        tmp.setNextIzq(node);
                        flag = true;
                    } else {
                        add(data, node, tmp.getNextIzq());
                    }
                } else {
                    System.out.println("\n--- [ DUPLICATED DATA: \"" + data + "\" ] ---");
                    flag = true;
                }
            }
        }
    }

    public void find(int data) {
        if (raiz == null) {
            System.out.println("\n--- [ NULL TREE ROOT ] ---");
        } else {
            boolean flag = false;
            Node tmp = raiz;
            while (!flag) {
                if (data == tmp.getData()) {
                    System.out.println("\n--- [ ENCONTRADO ] ---");
                    flag = true;
                } else {
                    if (data > tmp.getData()) {
                        tmp = tmp.getNextDer();
                    } else if (data < tmp.getData()) {
                        tmp = tmp.getNextIzq();
                    }
                }
            }
        }
    }

}
