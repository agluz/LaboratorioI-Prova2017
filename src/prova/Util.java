package prova;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angeloluz
 */
public class Util {
    
    public static void load(String mensagem, long tempo) {
        try {
            System.out.print(mensagem);
            long load = tempo / 5;
            int ponto = 0;
            while (ponto++ < 5) {
                System.out.print(".");
                Thread.sleep(load);
            }
            System.out.println("");
        } catch (InterruptedException ex) {
            Logger.getLogger(Boteco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
