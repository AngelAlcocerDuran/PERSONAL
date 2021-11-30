package binario;

public class Arbol {

    private Node raiz, menor, mayor;

    public void add(int data) {
        Node node = new Node(data, null, null);
        if (raiz == null) {
            System.out.println("--- [ NEW TREE ROOT CREATED: \""+data+"\" ] ---");
            raiz = node;
            menor = node;
            mayor = node;
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
    
    public void show(){
        Node tmp = raiz;
        
        while(tmp.getNextIzq() != null){
            System.out.println(tmp.getData());
            tmp = tmp.getNextIzq();
        }
        
        
    }
}
