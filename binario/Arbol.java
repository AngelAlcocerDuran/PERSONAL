
// CODE BY: ANGEL Y. ALCOCER DURÁN - 4BDSM

package binario;

public class Arbol {

    private Node raiz;

    public void add(int data) {
        Node node = new Node(data, null, null);
        if (raiz == null) {
            System.out.println("--- [ NEW TREE ROOT CREATED: \""+data+"\" ] ---");
            raiz = node;
        } else {
            boolean flag = false;
            Node tmp = raiz;
            while (!flag) {
                if (data > tmp.getData()) {
                    if(tmp.getNextDer() == null){
                        System.out.println("\n--- [ RIGTH INSERTING: \""+data+"\" ] ---");
                        tmp.setNextDer(node);
                        flag = true;
                    }else{
                        tmp = tmp.getNextDer();
                    }
                } else if(data < tmp.getData()){
                    if(tmp.getNextIzq() == null){
                        System.out.println("\n--- [ LEFT INSERTING: \""+data+"\" ] ---");
                        tmp.setNextIzq(node);
                        flag = true;
                    }else{
                        tmp = tmp.getNextIzq();
                    }
                } else {
                    System.out.println("\n--- [ DUPLICATED DATA: \""+data+"\" ] ---");
                    flag = true;
                }
            }
        }
    }
    
    public void find(int data){
        if(raiz == null){
            System.out.println("\n--- [ NULL TREE ROOT ] ---");
        }else{
            boolean flag = false;
            Node tmp = raiz;
            while(!flag){
                if(data == tmp.getData()){
                    flag = true;
                }else{
                    if(data > tmp.getData()){
                        tmp = tmp.getNextDer();
                    }else if(data < tmp.getData()){
                        tmp = tmp.getNextIzq();
                    }
                }
            }
            
            if(flag){
                System.out.println("\n--- [ FOUND: \""+data+"\" ] ---");
            }else{
                System.out.println("\n--- [ NOT FOUND: \""+data+"\" ] ---");
            }
        }
    }
    
    public void showPreOrder(){
        System.out.println("\n--- [ SHOWING IN PREORDER ] ---");
        preOrder(raiz);
    }
    
    public void preOrder(Node node){
        if(node == null){
            
        }else{
            System.out.println(node.getData());
            preOrder(node.getNextIzq());
            preOrder(node.getNextDer());
        }
    }
    
    public void showPostOrder(){
        System.out.println("\n--- [ SHOWING IN POSTORDER ] ---");
        postOrder(raiz);
    }
    
    public void postOrder(Node node){
        if(node == null){
            
        }else{
            postOrder(node.getNextIzq());
            postOrder(node.getNextDer());
            System.out.println(node.getData());
        }
    }
    
    public void showInOrder(){
        System.out.println("\n--- [ SHOWING IN INORDER ] ---");
        inOrder(raiz);
    }
    
    public void inOrder(Node node){
        if(node == null){
            
        }else{
            inOrder(node.getNextIzq());
            System.out.println(node.getData());
            inOrder(node.getNextDer());
        }
    }
}

// CODE BY: ANGEL Y. ALCOCER DURÁN - 4BDSM