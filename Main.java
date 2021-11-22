package lista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Lista l = new Lista();
        int opt = 0;
        String cdn, aux, c;
        char sel;

        do {
            System.out.println("\n--- [LISTA AYAD_4B] ---");
            System.out.println("1.- Agregar");
            System.out.println("2.- Agregar al inicio");
            System.out.println("3.- Actualizar");
            System.out.println("4.- Remover");
            System.out.println("5.- Mostrar lista");
            System.out.println("6.- BORRAR LISTA");
            System.out.println("7.- Salir...");
            System.out.println("--- [Escoge una opcion] ---");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("\n--- [Agregar] ---");
                    System.out.println("Ingrese el nombre a registrar:");
                    cdn = sc.next();

                    l.add(cdn);
                    break;

                case 2:
                    System.out.println("\n--- [Agregar al inicio] ---");
                    System.out.println("Ingrese el nombre a registrar:");
                    cdn = sc.next();

                    l.push(cdn);
                    break;

                case 3:
                    System.out.println("\n--- [Actualizar] ---");
                    l.show();
                    System.out.println("\nIngrese el nombre que quiere modificar:");
                    cdn = sc.next();
                    System.out.println("Ingrese el nuevo nombre:");
                    aux = sc.next();

                    do {
                        System.out.println("CONFIRMAR CAMBIOS [S/N]");
                        c = sc.next().toUpperCase();
                        sel = c.charAt(0);

                        if (sel == 'Y') {
                            l.update(cdn, aux);
                        } else if (sel == 'N') {
                            System.out.println("Descartando cambios...");
                        } else {
                            System.out.println("Escriba \"Y\" o \"N\"");
                        }
                    } while (sel != 'Y' && sel != 'N');
                    break;

                case 4:
                    System.out.println("\n--- [Remover] ---");
                    l.show();
                    System.out.println("\nIngrese el nombre que quiere remover:");
                    cdn = sc.next();

                    l.remove(cdn);
                    break;

                case 5:
                    l.show();
                    break;

                case 6:
                    System.out.println("\n--- [ADVERTENCIA] ---");
                    do {
                        System.out.println("Esta seguro de que desea eliminar la lista? [Y/N]");
                        cdn = sc.next().toUpperCase();
                        sel = cdn.charAt(0);

                        if (sel == 'Y') {
                            do {
                                System.out.println("CONFIRMAR CAMBIOS [Y/N]");
                                c = sc.next().toUpperCase();
                                sel = c.charAt(0);

                                if (sel == 'Y') {
                                    l.drop();
                                } else if (sel == 'N') {
                                    System.out.println("Descartando cambios...");
                                } else {
                                    System.out.println("Escriba \"Y\" o \"N\"");
                                }
                            } while (sel != 'Y' && sel != 'N');
                        } else if (sel == 'N') {
                            System.out.println("Descartando cambios...");
                        } else {
                            System.out.println("Escriba \"Y\" o \"N\"");
                        }
                    } while (sel != 'Y' && sel != 'N');

                    break;

                case 7:
                    System.out.println("\n<-- SALIENDO...");
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
            }
        } while (opt != 7);
    }
}
