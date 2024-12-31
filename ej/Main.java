package ej;

public class Main {
    public static void main(String[] myArgs) {
        try {
           Porte porte = new Porte(2,2,2, true);
           porte.lock();
        } catch (IllegalBlocException e) {
            System.out.println("Bloc can not be created");
        }
        catch (PorteLockedException f) {
            System.out.println("Porte is locked");
        }
    }
}
