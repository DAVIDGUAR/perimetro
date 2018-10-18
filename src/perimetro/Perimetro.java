
package perimetro;

import java.util.Scanner;


public class Perimetro {

  
    public static void main(String[] args) {
   
        perimetro perimetro1 = new perimetro();
        //primero declarar el objeto= perimetro1
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("base");
        perimetro1.setBase(ler.nextFloat());
        System.out.println("altura");
        perimetro1.setAltura(ler.nextFloat());
        System.out.println("perimetro ="+perimetro1.calculoPerimetro());
        
                
    }
    
}
