
package lista;


public class Main {
    
    public static void main(String[] args) {
        
        Lista l = new Lista();
        
        l.addEnd("Angel");
        l.addEnd("Erick");
        l.addEnd("Luis");
        l.addStart("Aaron");
        
        System.out.println("--[ REMOVE: Erick ]--");
        
        l.show();
    }
}
