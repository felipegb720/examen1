package gt.edu.url.examen1.impl;
import gt.edu.url.examen1.api.ChudnoskyRecursivo;
import gt.edu.url.examen1.api.ReporteroTenis;
/**
 *
 * @author Felipe_GB720
 */
public class Main {
    
    public static void main(String[] args) {
        
    	System.out.println("Examen Parcial 1");
        ChudnoskyRecursivo parte2 = new ChudnoskyRecursivo();
        System.out.println(parte2.calcularPi(3));
        ReporteroTenis parte3 = new ReporteroTenis();
        System.out.println(parte3.calcularGanador(2, 5));
        System.out.println(parte3.calcularCampeon());			
    	
    			 
    	
    	}

    }
    
}
