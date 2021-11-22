package lista;

public class Lista {

    private Node act = null;
    private int size = 0;

    public void add(String data) {
        System.out.println("\n--- [ADDED: \"" + data + "\"] ---");
        Node n = new Node(data, null);
        if (act == null) {
            act = n;
            size++;
        } else {
            Node tmp = act;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
            size++;
        }
    }

    public void push(String data) {
        System.out.println("\n--- [ADDED TO HEAD: \"" + data + "\"] ---");
        Node n = new Node(data, null);
        if (act == null) {
            act = n;
            size++;
        } else {
            n.setNext(act);
            act = n;
            size++;
        }
    }

    public void update(String data, String up) {
        System.out.println("\n--- [UPDATING: \"" + data + "\"] ---");
        if (act == null) {
            System.out.println("Lista Vacia...");
        } else {
            Node tmp = act;
            boolean flag = false;
            while (tmp.getData() != null && tmp.getNext() != null) {
                if (tmp.getData().equals(data)) {
                    tmp.setData(up);
                    flag = true;
                    break;
                } else {
                    tmp = tmp.getNext();
                }
            }

            if (tmp.getData().equals(data) && !flag) {
                tmp.setData(up);
                flag = true;
            }

            if (flag) {
                System.out.println("Se modifico \"" + data + "\" por \"" + up + "\"");
            } else {
                System.out.println("No se encontro el dato \"" + data + "\"");
            }
        }
    }

    public void remove(String data) {
        System.out.println("\n--- [REMOVING: \"" + data + "\"] ---");
        if (act == null) {
            System.out.println("Lista Vacia...");
        } else {
            Node tmp = act;
            Node ant = null;
            boolean flag = false;
            if (tmp.getData().equals(data) && tmp.getNext() == null) {
                act = null;
                flag = true;
                size--;
            } else {
                while (tmp.getData() != null && tmp.getNext() != null) {
                    if (tmp.getData().equals(data) && ant == null) {
                        act = tmp.getNext();
                        flag = true;
                        size--;
                        break;
                    } else if (tmp.getData().equals(data) && ant != null) {
                        ant.setNext(tmp.getNext());
                        flag = true;
                        size--;
                        break;
                    } else {
                        ant = tmp;
                        tmp = tmp.getNext();
                    }
                }

                if (tmp.getData().equals(data) && !flag) {
                    ant.setNext(null);
                    flag = true;
                    size--;
                }
            }

            if (flag) {
                System.out.println("Se removio a \"" + data + "\"");
            } else {
                System.out.println("No se encontro el dato \"" + data + "\"");
            }
        }
    }
    
    public void find(String data){
        
    }

    public void show() {
        System.out.println("\n--- [SHOWING DATA] ---");
        if (act == null) {
            System.out.println("Lista vacia...");
        } else {
            Node tmp = act;
            int i = 1;
            System.out.println("Tamaño: " + size);
            while (tmp.getNext() != null) {
                System.out.println(i + "> " + tmp.getData());
                tmp = tmp.getNext();
                i++;
            }
            System.out.println(i + "> " + tmp.getData());
        }
    }
    
    public void drop(){
        act = null;
        System.out.println("\nDATA DELETED...");
    }
}
