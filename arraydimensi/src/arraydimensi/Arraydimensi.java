package arraydimensi;

import java.util.Scanner;

/**
 *
 * @author Ratna Dinda Sari
 * 
 */
public class Arraydimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nama = new String[5];
        
        nama[0]= "Ratna";
        nama[1]= "Dinda";
        nama[2]= "Sari";
        nama[3]= "Dira";
        nama[4]= "Arsa";
        
        Scanner inp = new Scanner (System.in);
        
        for(int idx=0; idx<5; idx++){
            System.out.print("Data teman ke-"+String.valueOf(idx)+": "); //integer.toString()
            nama[idx] = inp.nextLine();
        }
        
        String NamaTeman = nama[2];
        System.out.printf("Data Teman : %s", nama[2]);
        
        for(int idx=0; idx<5; idx++){
           System.out.print("Data teman ke-"+String.valueOf(idx)+": "+  nama[idx]); 
           
        }
         
        for(String nm: nama){
            System.out.println(nm);
            
        }
    }
    
}
