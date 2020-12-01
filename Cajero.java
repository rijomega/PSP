package practica_UT02;

public class Cajero implements Runnable{
	
	String euro = "\u20AC";
	Cuenta cuenta=new Cuenta();
	
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			try {
				
		    Ingresar_Dinero(10);	
			Retirar_Dinero(20);             
			Retirar_Dinero(05);             
		if (cuenta.getSaldo_Actual()<0) {	
			 System.out.println("NO HAY MAS DINERO!!!");
		}
				Thread.sleep(700);           // Duermo el hilo durante 9 décimas de segundo 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void Retirar_Dinero(int Monto_Retiro) {
		
		if (cuenta.getSaldo_Actual()>=Monto_Retiro) {
			
			    // Decremento del saldo.
			
			System.out.println(Thread.currentThread().getName()+"   retiró: "+Monto_Retiro+ euro); 
		    cuenta.retiro_cuenta(Monto_Retiro);
		    System.out.println("Saldo en la cuenta: "+cuenta.getSaldo_Actual()+euro);   
		}
	}	
	
    public synchronized void Ingresar_Dinero(int Monto_Ingreso) {
    	
		        // Incremento del saldo.
    	
    	if (cuenta.getSaldo_Actual()>0) {    		
			 cuenta.ingreso_cuenta(Monto_Ingreso);
			 System.out.println(Thread.currentThread().getName()+"  ingresó: "+Monto_Ingreso+ euro);
			 System.out.println("Saldo en la cuenta: "+cuenta.getSaldo_Actual()+euro);
    	}			
	}
}
