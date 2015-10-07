

package boletin2_6;

import java.util.Scanner;


public class Boletin2_6 {

    
    public static void main(String[] args) {
        float millas, metros;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce la cantidad de millas : ");
        millas=obx.nextFloat();
        metros=millas*1852;
        System.out.println(millas+ "millas equivalen a "+ metros + "metros");
        
       
    }
    
}
