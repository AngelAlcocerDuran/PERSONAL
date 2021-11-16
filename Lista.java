
package lista;


public class Lista {

    private Node act = null;
    private String data = null;
    
    public void addEnd(String data){
        Node n = new Node(data, null);
        if(act == null){
            act = n;
        }else if(act.getNext() == null){
            act.setNext(n);
        }else{
            Node tmp = act;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(n);
        }
    }
    
    public void addStart(String data){
        Node n = new Node(data, null);
        if(act == null){
            act = n;
        }else{
            n.setNext(act);
            act = n;
        }
    }
    
    public void remove(String data){
        if(act == null){
            System.out.println("Lista Vacia...");
        }else{
            Node tmp = act;
            
        }
    }
    
    public void show(){
        Node tmp = act;
        do{
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }while(tmp.getNext() != null);
        System.out.println(tmp.getData());
    }
}
