package practica_UT02;

public class Cuenta {
	
    private static int saldo_actual=100; //saldo inicial de la cuenta.
    
	public int getSaldo_Actual() {
    	return saldo_actual;
    }
    public synchronized void retiro_cuenta(int valor_retiro) { //m�todo para retirar dinero.
    	saldo_actual-=valor_retiro;
    	
        // Duermo el hilo durante 9 d�cimas de segundo 
        // para simular el retiro.
    	 try {
             Thread.sleep(700);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }	 
    
    public synchronized void ingreso_cuenta(int valor_ingreso) { //m�todo para ingresar dinero.   	
        saldo_actual += valor_ingreso;
        
     // Duermo el hilo durante 9 d�cimas de segundo 
        // para simular el ingreso.
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }     
}
