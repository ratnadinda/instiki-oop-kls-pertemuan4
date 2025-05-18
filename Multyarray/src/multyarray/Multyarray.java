package multyarray;

import java.util.Scanner;

/**
 *
 * @author Ratna Dinda Sari
 */
public class Multyarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String [3][4];
        Scanner inp = new Scanner(System.in);
        
        for(int brs=0; brs<2; brs++){
          for(int klm=0; klm<4; klm++){
              System.out.println("Data Meja Baris: %d, kolom: %d:"+meja[brs][klm]);
          }  
          System.out.println("");
          
        }
    }
    
}
