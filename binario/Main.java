
// CODE BY: ANGEL Y. ALCOCER DURÁN - 4BDSM

package binario;

public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        
        a.add(100);
        a.add(98);
        a.add(180);
        a.add(175);
        a.add(190);
        a.add(45);
        a.add(12);
        a.add(10);
        a.add(50);
        
        a.showPreOrder();
        a.showPostOrder();
        a.showInOrder();
    }
}

// CODE BY: ANGEL Y. ALCOCER DURÁN - 4BDSM