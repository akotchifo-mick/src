package ej;

import ej.blocs.Porte;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] myArgs) {
        log.error("Test de logging");
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
